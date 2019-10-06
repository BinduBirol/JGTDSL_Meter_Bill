package birol.bill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import birol.dto.BillMeteredDTO;
import birol.dto.CustomerBasicDto;
import birol.dto.InputParams;
import birol.dto.Reading;
import birol.dto.Test_b;
import birol.utility.BillMeteredRepo;

@Repository
public class BillingServiceHelper {
	
	@Autowired
	public BillMeteredRepo billMeterRepo;
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public BillMeteredDTO addDemandCharge(BillMeteredDTO c_bill, Reading r) {		
		
		long demand_charge=0;
		long billed_amount=c_bill.getBilled_amount();
		long payable_amount=c_bill.getPayable_amount();
		demand_charge= Math.round(r.getMax_load()*0.1);
		
		c_bill.setDemand_charge((demand_charge));
		c_bill.setBilled_amount(billed_amount+demand_charge);
		c_bill.setPayable_amount(payable_amount+demand_charge);
		
		return c_bill;
	}
	
	public BillMeteredDTO addCustBasicInfo(BillMeteredDTO cb, CustomerBasicDto c) {
		cb.setArea_id(c.getArea_id());
		cb.setCustomer_id(c.getCustomer_id());
		cb.setCustomer_name(c.getFull_name());
		cb.setProprietor_name(c.getProprietor_name());		
		cb.setCustomer_category(c.getCategory_id());
		cb.setCustomer_category_name(c.getCategory_name());		
		cb.setArea_id(c.getArea_id());
		cb.setArea_name(c.getArea_name());				
		cb.setAddress(c.getAddress());		
		cb.setPhone(c.getPhone());
		cb.setMobile(c.getMobile());
		cb.setMinimum_load(c.getMin_load());		
		return cb;
	}
	
	public BillMeteredDTO addBillbasicInfo(BillMeteredDTO b, Reading r) {		
		String bill_id= r.getBilling_year().toString()+String.format("%02d" , r.getBilling_month()).toString()+r.getCustomer_id();		
		b.setBill_id(bill_id);
		b.setBill_month(r.getBilling_month());
		b.setBill_year(r.getBilling_year());
		b.setStatus(0);
		b.setMeter_rent((int) Math.round(r.getMeter_rent()));
		
		return b;
	}
	
	public BillMeteredDTO addBillDatesAndOthers(BillMeteredDTO b, InputParams i, CustomerBasicDto c ) {		
		try {			 
			 Date issue_date=new SimpleDateFormat("dd-MM-yyyy").parse(i.getiIssueDate());
			 b.setIssue_date(issue_date);
			 b.setLast_pay_date_w_sc(addDays(issue_date, c.getPay_within_w_sc()));
			 b.setLast_pay_date_w_sc_view(addDays(issue_date, c.getPay_within_w_sc()));
			 b.setLast_pay_date_wo_sc(addDays(issue_date, c.getPay_within_wo_sc()));
			 b.setLast_pay_date_wo_sc_view(addDays(issue_date, c.getPay_within_wo_sc()));
			 
			 b.setNote(i.getiRemarks());
			 
			 Date pdate = new Date();
			 b.setPrepared_date(pdate);
			 
		} catch (Exception e) {			
			e.printStackTrace();
		}  
		
		
		return b;
	}
	
	
	
	
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); // minus number would decrement the days
		return cal.getTime();
	}

}
