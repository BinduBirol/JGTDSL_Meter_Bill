package birol.bill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.persistence.EntityManager;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import birol.dto.BillMeteredDTO;
import birol.dto.CustomerBasicDto;
import birol.dto.InputParams;
import birol.dto.Reading;
import birol.dto.Response;
import birol.dto.TariffDTO;
import birol.dto.Test_b;
import birol.dto.Variables;
import birol.utility.BillMeteredRepo;
import birol.utility.CustomerBasicInfoRepo;
import birol.utility.InputPraramRepo;
import birol.utility.ReadingRepository;
import birol.utility.TariffRepo;

@Service
public class BillingService {
	@Autowired
	private ReadingRepository readingRepository;
	@Autowired
	private CustomerBasicInfoRepo customerBasicInfoRepo;
	@Autowired
	private TariffRepo tariffRepo;	
	@Autowired
	public BillMeteredRepo billMeterRepo;
	@Autowired
	private SessionFactory sessionFactory;
	
	private List<CustomerBasicDto> customer_list = new ArrayList<CustomerBasicDto>();
	private List<Reading> reading_list= new ArrayList<Reading>();
	private List<TariffDTO> tariff_list= new ArrayList<TariffDTO>();
	private List<BillMeteredDTO> cust_bill_list= new ArrayList<BillMeteredDTO>();
	BillingServiceHelper bhelp= new BillingServiceHelper();
	
	public Response billProcess(InputParams inputParams) throws SQLException {
		customer_list = new ArrayList<CustomerBasicDto>();
		reading_list= new ArrayList<Reading>();
		tariff_list= new ArrayList<TariffDTO>();
		Response response= new Response() ;
		List<BillMeteredDTO> bill_list= new ArrayList<>();
		tariff_list= tariffRepo.getAlltariffs();		
		
		//Individual
		if(inputParams.getiBillFor().equalsIgnoreCase("individual_customer")) {			
			customer_list= customerBasicInfoRepo.getByIndividual(inputParams.getiCustomerId(), inputParams.getiAreaId());
			reading_list= readingRepository.findReadingbyIdMonthYear(inputParams.getiCustomerId(),inputParams.getiBillMonth() , inputParams.getiBillYear());						
		//Category wise	
		}else if (inputParams.getiBillFor().equalsIgnoreCase("category_wise")) {			
			customer_list= customerBasicInfoRepo.getByCategory(inputParams.getiCategoryId(), inputParams.getiAreaId());
			reading_list= readingRepository.findReadingbyCategoryMonthYear(inputParams.getiCategoryId(),inputParams.getiBillMonth() , inputParams.getiBillYear());		
		//Area Wise
		}else if (inputParams.getiBillFor().equalsIgnoreCase("area_wise")) {			
			customer_list= customerBasicInfoRepo.getByArea(inputParams.getiAreaId());
			reading_list= readingRepository.findReadingbyAreaMonthYear(inputParams.getiAreaId(),inputParams.getiBillMonth() , inputParams.getiBillYear());						
		}
		
		try {		
			for(CustomerBasicDto c : customer_list) {
				List<Reading> custReading = reading_list.stream().filter(r -> r.getCustomer_id().equals(c.getCustomer_id())).collect(Collectors.toList());
				if (custReading.size() > 0) {
					bill_list.add(processIndividualBill(c, inputParams, custReading));
					response = insertToDb(bill_list);
				} else {
					response.setMessage("Could not process bill");
					String desc="";
					desc= desc+ "Reading not found for " + c.getCustomer_id();
					response.setDescription(desc);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();		
		}
		return response;
	}
	
	//individual bill
	private BillMeteredDTO processIndividualBill(CustomerBasicDto customer, InputParams inputParams, List<Reading> custReading) {
		BillMeteredDTO prepeared_bill= new BillMeteredDTO();
		BillMeteredDTO cust_bill= new BillMeteredDTO();
		cust_bill_list= new ArrayList<>();
		try {						
			for(Reading r: custReading) {				
				cust_bill= new BillMeteredDTO();
				cust_bill= bhelp.addCustBasicInfo(cust_bill, customer);
				cust_bill= bhelp.addBillbasicInfo(cust_bill, r);
				cust_bill= bhelp.addBillDatesAndOthers(cust_bill, inputParams, customer);				
				if(r.getReading_purpose()==0) {
					NEW_METER(r);
				}else if(r.getReading_purpose()==1) {					
					RECONNECT_METER_BILL(r);
				}else if(r.getReading_purpose()==2) {
					general_billing(r, customer, cust_bill);
				}else if(r.getReading_purpose()==3) {
					AVERAGE_BILLING(r);
				}else if(r.getReading_purpose()==4) {
					DISCONNECT_METER(r);
				}else if(r.getReading_purpose()==5) {
					PRESSURE_CHANGE(r);
				}else if(r.getReading_purpose()==6) {
					BILL_ON_MAX_LOAD(r);
				}else if(r.getReading_purpose()==7) {
					PROPORTIONAL_BILL(r);
				}else if(r.getReading_purpose()==8) {
					ADJUSTMENT_BILL(r);
				}else if(r.getReading_purpose()==9) {
					bill_on_min_load(r, customer, cust_bill);
				}else if(r.getReading_purpose()==10) {
					bill_on_actual_load(r, customer, cust_bill);
				}					
				cust_bill_list.add(cust_bill);				
			}
			//finalize bill			
			prepeared_bill=prepareBill(cust_bill_list);
					
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return prepeared_bill;
	}	
	
	private BillMeteredDTO general_billing(Reading r, CustomerBasicDto c, BillMeteredDTO cb) {
		bhelp= new BillingServiceHelper();					
		
		//before new terms for JGTDSL July 2019
		if(r.getBilling_month()<7 && r.getBilling_year()<=2019) {			
			if(r.getPmin_load()<r.getMin_load()) {
				cb= bill_on_min_load(r,c,cb);				
			}else {
				cb= bill_on_actual_load(r,c,cb);			
			}		
		}
		//after new terms for JGTDSL July 2019	
		else {
			cb= bill_on_actual_load(r, c,cb);
			cb= bhelp.addDemandCharge(cb, r);
		}		
		
		return cb;		
	}
	
	private BillMeteredDTO bill_on_actual_load(Reading r, CustomerBasicDto c,  BillMeteredDTO cb) {			
		Variables v= new Variables();		
		Optional<TariffDTO> custTariff = tariff_list.stream().filter(t -> t.getTariff_id().equals(r.getTariff_id())).findFirst();	
		
		cb.setActual_gas_consumption(r.getActual_consumption());
		cb.setBilled_consumption(r.getActual_consumption());
		//gas bill
		v.settPbGasBillAmount(Math.round(custTariff.get().getPrice()*r.getActual_consumption()));
		//total bill
		v.settBillAmount(Math.round(v.gettPbGasBillAmount()+r.getMeter_rent()));
		
		cb.setBilled_amount(v.gettBillAmount());
		cb.setPayable_amount(v.gettBillAmount());
		return cb;			
	}

	private BillMeteredDTO bill_on_min_load(Reading r, CustomerBasicDto c,  BillMeteredDTO cb) {
		Variables v= new Variables();		
		Optional<TariffDTO> custTariff = tariff_list.stream().filter(t -> t.getTariff_id().equals(r.getTariff_id())).findFirst();	
		
		cb.setActual_gas_consumption(r.getActual_consumption());
		cb.setBilled_consumption(r.getActual_consumption());
		//min load bill
		v.settPbGasBillAmount(Math.round(custTariff.get().getPrice()*r.getPmin_load()));
		//total bill
		v.settBillAmount(Math.round(v.gettPbGasBillAmount()+r.getMeter_rent()));
		
		cb.setBilled_amount(v.gettBillAmount());
		cb.setPayable_amount(v.gettBillAmount());
		return cb;		
	}

	private void ADJUSTMENT_BILL(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void PROPORTIONAL_BILL(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void BILL_ON_MAX_LOAD(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void PRESSURE_CHANGE(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void DISCONNECT_METER(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void AVERAGE_BILLING(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void RECONNECT_METER_BILL(Reading r) {
		// TODO Auto-generated method stub
		
	}

	private void NEW_METER(Reading r) {
		// TODO Auto-generated method stub
		
	}
	
	// finalize summarize bill
	public BillMeteredDTO prepareBill(List<BillMeteredDTO> cust_bill_list) {
		double actual_consumption = 0.00d;
		double other_consumption = 0;
		double mixed_consumption = 0;
		double billed_consumption = 0;
		double hhv_nhv_q = 0;
		long billed_amount = 0;
		int meter_rent = 0;
		int surcharge = 0;
		long payable = 0;
		long demand_charge = 0;
		int hhv_bill = 0;
		String amount_in_word = "";
		BillMeteredDTO final_bill = new BillMeteredDTO();
		int i = 0;

		for (BillMeteredDTO b : cust_bill_list) {
			if (i == 0) {
				final_bill.setBill_id(b.getBill_id());
				final_bill.setBill_month(b.getBill_month());
				final_bill.setBill_year(b.getBill_year());
				final_bill.setCustomer_id(b.getCustomer_id());
				final_bill.setCustomer_name(b.getCustomer_name());
				final_bill.setProprietor_name(b.getProprietor_name());
				final_bill.setCustomer_category(b.getCustomer_category());
				final_bill.setCustomer_category_name(b.getCustomer_category_name());
				final_bill.setArea_id(b.getArea_id());
				final_bill.setArea_name(b.getArea_name());
				final_bill.setAddress(b.getAddress());
				final_bill.setPhone(b.getPhone());
				final_bill.setMobile(b.getMobile());
				final_bill.setIssue_date(b.getIssue_date());
				final_bill.setLast_pay_date_w_sc(b.getLast_pay_date_w_sc());
				final_bill.setLast_pay_date_w_sc_view(b.getLast_pay_date_w_sc_view());
				final_bill.setLast_pay_date_wo_sc(b.getLast_pay_date_wo_sc());
				final_bill.setLast_pay_date_wo_sc_view(b.getLast_pay_date_wo_sc_view());
				final_bill.setPrepared_by(b.getPrepared_by());
				final_bill.setPrepared_date(b.getPrepared_date());
				final_bill.setNote(b.getNote());
			}
			actual_consumption = +b.getActual_gas_consumption();
			//other_consumption = +b.getOther_consumption();
			//mixed_consumption = +b.getMixed_consumption();
			//billed_consumption = +b.getBilled_consumption();
			//hhv_nhv_q = +b.getHhv_nhv_qnt();
			billed_amount = +b.getBilled_amount();
			meter_rent = +b.getMeter_rent();
			//surcharge = +b.getSurcharge_amount();
			payable = +b.getPayable_amount();
			demand_charge = +b.getDemand_charge();
			//hhv_bill = +b.getHhv_bill();
			i++;
		}
		final_bill.setActual_gas_consumption(actual_consumption);
		final_bill.setOther_consumption(other_consumption);
		final_bill.setMixed_consumption(mixed_consumption);
		final_bill.setBilled_consumption(billed_consumption);
		final_bill.setHhv_nhv_qnt(hhv_nhv_q);
		final_bill.setBilled_amount(billed_amount);
		final_bill.setMeter_rent(meter_rent);
		final_bill.setSurcharge_amount(surcharge);
		final_bill.setPayable_amount(payable);
		final_bill.setDemand_charge(demand_charge);
		final_bill.setHhv_bill(hhv_bill);
		return final_bill;
	}
		
	public Response insertToDb(List<BillMeteredDTO> f_bill_list) throws SQLException {
		Session session= null;
		Response r= new Response();
		try {
		session = sessionFactory.openSession();
		session.beginTransaction();

		int batchSize = 20;
		for (int i = 0; i < f_bill_list.size(); i++) {
			session.persist(f_bill_list.get(i));
			if (i > 0 && i % batchSize == 0) {
				session.flush();
				session.clear();			
			}
		}
		session.getTransaction().commit();
		session.close();
		
		}catch(Exception e) {			
			e.printStackTrace();			
			Throwable cause = null; 
		    Throwable result = e;
		    String desc= "";
		    
		    while(null != (cause = result.getCause())  && (result != cause) ) {
		        result = cause;
		        desc=desc+result.getMessage();
		        r.setMessage(result.getMessage());
		        r.setDescription(desc);
		    }
		}

		return r;

	}
}
