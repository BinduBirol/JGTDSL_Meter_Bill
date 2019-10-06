package birol.dto;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name= "BILL_METERED")
public class BillMeteredDTO {
	
	@Id
	private String bill_id;
	
	private String invoice_no;
	
	private Integer bill_month;
	
	private Integer bill_year;
	
	private String customer_id;
	
	private String customer_name;
	
	private String proprietor_name;
	
	private String customer_category;
	
	private String customer_category_name;
	
	private String area_id;
	
	private String area_name;
	
	private String address;
	
	private String phone;
	
	private String mobile;
	
	private Date issue_date;
	
	private Date last_pay_date_wo_sc;
	
	private Date last_pay_date_wo_sc_view;
	
	private Date last_pay_date_w_sc;
	
	private Date last_pay_date_w_sc_view;
	
	private Date last_disconn_reconn_date;
	
	private Double monthly_contactual_load;
	
	private Double minimum_load;
	
	private double actual_gas_consumption;
	
	private Double other_consumption;
	
	private Double mixed_consumption;
	
	private Double hhv_nhv_qnt;
	
	private double billed_consumption;
	
	private long billed_amount;
	
	private Integer meter_rent;
	
	private Integer cms_rent;
	
	private Integer surcharge_amount;
	
	private long payable_amount;
	
	private String amount_in_word;
	
	private Integer collected_amount;
	
	private Integer collected_surcharge;
	
	private String prepared_by;
	
	private Date prepared_date;
	
	private Integer status;
		
	private String note;
	
	private String surcharge_issue_date;
	
	private String collection_date;
	
	private String branch_id;
	
	private Integer hhv_bill;
	
	private Integer surcharge_priv;
		
	private long demand_charge;
	
	public BillMeteredDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBill_id() {
		return bill_id;
	}

	public void setBill_id(String bill_id) {
		this.bill_id = bill_id;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Integer getBill_month() {
		return bill_month;
	}

	public void setBill_month(Integer bill_month) {
		this.bill_month = bill_month;
	}

	public Integer getBill_year() {
		return bill_year;
	}

	public void setBill_year(Integer bill_year) {
		this.bill_year = bill_year;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getProprietor_name() {
		return proprietor_name;
	}

	public void setProprietor_name(String proprietor_name) {
		this.proprietor_name = proprietor_name;
	}

	public String getCustomer_category() {
		return customer_category;
	}

	public void setCustomer_category(String customer_category) {
		this.customer_category = customer_category;
	}

	public String getCustomer_category_name() {
		return customer_category_name;
	}

	public void setCustomer_category_name(String customer_category_name) {
		this.customer_category_name = customer_category_name;
	}

	public String getArea_id() {
		return area_id;
	}

	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Double getMonthly_contactual_load() {
		return monthly_contactual_load;
	}

	public void setMonthly_contactual_load(Double monthly_contactual_load) {
		this.monthly_contactual_load = monthly_contactual_load;
	}

	public Double getMinimum_load() {
		return minimum_load;
	}

	public void setMinimum_load(Double minimum_load) {
		this.minimum_load = minimum_load;
	}

	public double getActual_gas_consumption() {
		return actual_gas_consumption;
	}

	public void setActual_gas_consumption(double actual_consumption) {
		this.actual_gas_consumption = actual_consumption;
	}

	public Double getOther_consumption() {
		return other_consumption;
	}

	public void setOther_consumption(Double other_consumption) {
		this.other_consumption = other_consumption;
	}

	public Double getMixed_consumption() {
		return mixed_consumption;
	}

	public void setMixed_consumption(Double mixed_consumption) {
		this.mixed_consumption = mixed_consumption;
	}

	public Double getHhv_nhv_qnt() {
		return hhv_nhv_qnt;
	}

	public void setHhv_nhv_qnt(Double hhv_nhv_qnt) {
		this.hhv_nhv_qnt = hhv_nhv_qnt;
	}

	public double getBilled_consumption() {
		return billed_consumption;
	}

	public void setBilled_consumption(double l) {
		this.billed_consumption = l;
	}

	public long getBilled_amount() {
		return billed_amount;
	}

	public void setBilled_amount(long billed_amount) {
		this.billed_amount = billed_amount;
	}

	public Integer getMeter_rent() {
		return meter_rent;
	}

	public void setMeter_rent(Integer meter_rent) {
		this.meter_rent = meter_rent;
	}

	public Integer getCms_rent() {
		return cms_rent;
	}

	public void setCms_rent(Integer cms_rent) {
		this.cms_rent = cms_rent;
	}

	public Integer getSurcharge_amount() {
		return surcharge_amount;
	}

	public void setSurcharge_amount(Integer surcharge_amount) {
		this.surcharge_amount = surcharge_amount;
	}

	public long getPayable_amount() {
		return payable_amount;
	}

	public void setPayable_amount(long l) {
		this.payable_amount = l;
	}

	public String getAmount_in_word() {
		return amount_in_word;
	}

	public void setAmount_in_word(String amount_in_word) {
		this.amount_in_word = amount_in_word;
	}

	public Integer getCollected_amount() {
		return collected_amount;
	}

	public void setCollected_amount(Integer collected_amount) {
		this.collected_amount = collected_amount;
	}

	public Integer getCollected_surcharge() {
		return collected_surcharge;
	}

	public void setCollected_surcharge(Integer collected_surcharge) {
		this.collected_surcharge = collected_surcharge;
	}

	public String getPrepared_by() {
		return prepared_by;
	}

	public void setPrepared_by(String prepared_by) {
		this.prepared_by = prepared_by;
	}

	

	public Date getLast_pay_date_wo_sc() {
		return last_pay_date_wo_sc;
	}

	public void setLast_pay_date_wo_sc(Date last_pay_date_wo_sc) {
		this.last_pay_date_wo_sc = last_pay_date_wo_sc;
	}

	public Date getLast_pay_date_wo_sc_view() {
		return last_pay_date_wo_sc_view;
	}

	public void setLast_pay_date_wo_sc_view(Date last_pay_date_wo_sc_view) {
		this.last_pay_date_wo_sc_view = last_pay_date_wo_sc_view;
	}

	public Date getLast_pay_date_w_sc() {
		return last_pay_date_w_sc;
	}

	public void setLast_pay_date_w_sc(Date last_pay_date_w_sc) {
		this.last_pay_date_w_sc = last_pay_date_w_sc;
	}

	public Date getLast_pay_date_w_sc_view() {
		return last_pay_date_w_sc_view;
	}

	public void setLast_pay_date_w_sc_view(Date last_pay_date_w_sc_view) {
		this.last_pay_date_w_sc_view = last_pay_date_w_sc_view;
	}

	public Date getLast_disconn_reconn_date() {
		return last_disconn_reconn_date;
	}

	public void setLast_disconn_reconn_date(Date last_disconn_reconn_date) {
		this.last_disconn_reconn_date = last_disconn_reconn_date;
	}

	public Date getPrepared_date() {
		return prepared_date;
	}

	public void setPrepared_date(Date prepared_date) {
		this.prepared_date = prepared_date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSurcharge_issue_date() {
		return surcharge_issue_date;
	}

	public void setSurcharge_issue_date(String surcharge_issue_date) {
		this.surcharge_issue_date = surcharge_issue_date;
	}

	public String getCollection_date() {
		return collection_date;
	}

	public void setCollection_date(String collection_date) {
		this.collection_date = collection_date;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public Integer getHhv_bill() {
		return hhv_bill;
	}

	public void setHhv_bill(Integer hhv_bill) {
		this.hhv_bill = hhv_bill;
	}

	public Integer getSurcharge_priv() {
		return surcharge_priv;
	}

	public void setSurcharge_priv(Integer surcharge_priv) {
		this.surcharge_priv = surcharge_priv;
	}

	public long getDemand_charge() {
		return demand_charge;
	}

	public void setDemand_charge(long demand_charge) {
		this.demand_charge = demand_charge;
	}

	@Override
	public String toString() {
		return "BillMeteredDTO [bill_id=" + bill_id + ", invoice_no=" + invoice_no + ", bill_month=" + bill_month
				+ ", bill_year=" + bill_year + ", customer_id=" + customer_id + ", customer_name=" + customer_name
				+ ", proprietor_name=" + proprietor_name + ", customer_category=" + customer_category
				+ ", customer_category_name=" + customer_category_name + ", area_id=" + area_id + ", area_name="
				+ area_name + ", address=" + address + ", phone=" + phone + ", mobile=" + mobile + ", issue_date="
				+ issue_date + ", last_pay_date_wo_sc=" + last_pay_date_wo_sc + ", last_pay_date_wo_sc_view="
				+ last_pay_date_wo_sc_view + ", last_pay_date_w_sc=" + last_pay_date_w_sc + ", last_pay_date_w_sc_view="
				+ last_pay_date_w_sc_view + ", last_disconn_reconn_date=" + last_disconn_reconn_date
				+ ", monthly_contactual_load=" + monthly_contactual_load + ", minimum_load=" + minimum_load
				+ ", actual_gas_consumption=" + actual_gas_consumption + ", other_consumption=" + other_consumption
				+ ", mixed_consumption=" + mixed_consumption + ", hhv_nhv_qnt=" + hhv_nhv_qnt + ", billed_consumption="
				+ billed_consumption + ", billed_amount=" + billed_amount + ", meter_rent=" + meter_rent + ", cms_rent="
				+ cms_rent + ", surcharge_amount=" + surcharge_amount + ", payable_amount=" + payable_amount
				+ ", amount_in_word=" + amount_in_word + ", collected_amount=" + collected_amount
				+ ", collected_surcharge=" + collected_surcharge + ", prepared_by=" + prepared_by + ", prepared_date="
				+ prepared_date + ", status=" + status + ", note=" + note + ", surcharge_issue_date="
				+ surcharge_issue_date + ", collection_date=" + collection_date + ", branch_id=" + branch_id
				+ ", hhv_bill=" + hhv_bill + ", surcharge_priv=" + surcharge_priv + ", demand_charge=" + demand_charge
				+ "]";
	}

	public BillMeteredDTO(String bill_id, String invoice_no, Integer bill_month, Integer bill_year, String customer_id,
			String customer_name, String proprietor_name, String customer_category, String customer_category_name,
			String area_id, String area_name, String address, String phone, String mobile, Date issue_date,
			Date last_pay_date_wo_sc, Date last_pay_date_wo_sc_view, Date last_pay_date_w_sc,
			Date last_pay_date_w_sc_view, Date last_disconn_reconn_date, Double monthly_contactual_load,
			Double minimum_load, long actual_gas_consumption, Double other_consumption, Double mixed_consumption,
			Double hhv_nhv_qnt, long billed_consumption, long billed_amount, Integer meter_rent, Integer cms_rent,
			Integer surcharge_amount, long payable_amount, String amount_in_word, Integer collected_amount,
			Integer collected_surcharge, String prepared_by, Date prepared_date, Integer status, String note,
			String surcharge_issue_date, String collection_date, String branch_id, Integer hhv_bill,
			Integer surcharge_priv, long demand_charge) {
		super();
		this.bill_id = bill_id;
		this.invoice_no = invoice_no;
		this.bill_month = bill_month;
		this.bill_year = bill_year;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.proprietor_name = proprietor_name;
		this.customer_category = customer_category;
		this.customer_category_name = customer_category_name;
		this.area_id = area_id;
		this.area_name = area_name;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.issue_date = issue_date;
		this.last_pay_date_wo_sc = last_pay_date_wo_sc;
		this.last_pay_date_wo_sc_view = last_pay_date_wo_sc_view;
		this.last_pay_date_w_sc = last_pay_date_w_sc;
		this.last_pay_date_w_sc_view = last_pay_date_w_sc_view;
		this.last_disconn_reconn_date = last_disconn_reconn_date;
		this.monthly_contactual_load = monthly_contactual_load;
		this.minimum_load = minimum_load;
		this.actual_gas_consumption = actual_gas_consumption;
		this.other_consumption = other_consumption;
		this.mixed_consumption = mixed_consumption;
		this.hhv_nhv_qnt = hhv_nhv_qnt;
		this.billed_consumption = billed_consumption;
		this.billed_amount = billed_amount;
		this.meter_rent = meter_rent;
		this.cms_rent = cms_rent;
		this.surcharge_amount = surcharge_amount;
		this.payable_amount = payable_amount;
		this.amount_in_word = amount_in_word;
		this.collected_amount = collected_amount;
		this.collected_surcharge = collected_surcharge;
		this.prepared_by = prepared_by;
		this.prepared_date = prepared_date;
		this.status = status;
		this.note = note;
		this.surcharge_issue_date = surcharge_issue_date;
		this.collection_date = collection_date;
		this.branch_id = branch_id;
		this.hhv_bill = hhv_bill;
		this.surcharge_priv = surcharge_priv;
		this.demand_charge = demand_charge;
	}	

}
