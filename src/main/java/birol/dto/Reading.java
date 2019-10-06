package birol.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VIEW_METER_READING")
public class Reading {
	@Id
	private Integer reading_id;	
	private Integer billing_month;	
	private Integer billing_year;	
	private String customer_id;
	private Integer meter_id;
	private Integer reading_purpose;
	private Integer prev_reading;
	private String prev_reading_date;
	private Integer curr_reading;
	private String curr_reading_date;
	private Integer difference;
	private Double pressure;
	private Double pressure_factor;
	private Double temperature;
	private Double temperature_factor;
	private long actual_consumption;
	private Double hhv_nhv;
	private Double total_consumption;
	private Double hhv_nhv_adjustment;
	private String tariff_id;
	private Double rate;
	private Double meter_rent;
	private Double min_load;
	private Double max_load;
	private Double pmin_load;
	private Double pmax_load;
	private Integer vat_rebate;	
	
	public Reading(Integer reading_id, Integer billing_month, Integer billing_year, String customer_id, Integer meter_id,
			Integer reading_purpose, Integer prev_reading, String prev_reading_date, Integer curr_reading, String curr_reading_date,
			Integer difference, Double pressure, Double pressure_factor, Double temperature, Double temperature_factor,
			long actual_consumption, Double hhv_nhv, Double total_consumption, Double hhv_nhv_adjustment,
			String tariff_id, Double rate, Double meter_rent, Double min_load, Double max_load, Double pmin_load,
			Double pmax_load, Integer vat_rebate) {
		super();
		this.reading_id = reading_id;
		this.billing_month = billing_month;
		this.billing_year = billing_year;
		this.customer_id = customer_id;
		this.meter_id = meter_id;
		this.reading_purpose = reading_purpose;
		this.prev_reading = prev_reading;
		this.prev_reading_date = prev_reading_date;
		this.curr_reading = curr_reading;
		this.curr_reading_date = curr_reading_date;
		this.difference = difference;
		this.pressure = pressure;
		this.pressure_factor = pressure_factor;
		this.temperature = temperature;
		this.temperature_factor = temperature_factor;
		this.actual_consumption = actual_consumption;
		this.hhv_nhv = hhv_nhv;
		this.total_consumption = total_consumption;
		this.hhv_nhv_adjustment = hhv_nhv_adjustment;
		this.tariff_id = tariff_id;
		this.rate = rate;
		this.meter_rent = meter_rent;
		this.min_load = min_load;
		this.max_load = max_load;
		this.pmin_load = pmin_load;
		this.pmax_load = pmax_load;
		this.vat_rebate = vat_rebate;
	}
	
	
	
	public Reading() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getReading_id() {
		return reading_id;
	}
	public void setReading_id(Integer reading_id) {
		this.reading_id = reading_id;
	}
	public Integer getBilling_month() {
		return billing_month;
	}
	public void setBilling_month(Integer billing_month) {
		this.billing_month = billing_month;
	}
	public Integer getBilling_year() {
		return billing_year;
	}
	public void setBilling_year(Integer billing_year) {
		this.billing_year = billing_year;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getMeter_id() {
		return meter_id;
	}
	public void setMeter_id(Integer meter_id) {
		this.meter_id = meter_id;
	}
	public Integer getReading_purpose() {
		return reading_purpose;
	}
	public void setReading_purpose(Integer reading_purpose) {
		this.reading_purpose = reading_purpose;
	}
	public Integer getPrev_reading() {
		return prev_reading;
	}
	public void setPrev_reading(Integer prev_reading) {
		this.prev_reading = prev_reading;
	}
	public String getPrev_reading_date() {
		return prev_reading_date;
	}
	public void setPrev_reading_date(String prev_reading_date) {
		this.prev_reading_date = prev_reading_date;
	}
	public Integer getCurr_reading() {
		return curr_reading;
	}
	public void setCurr_reading(Integer curr_reading) {
		this.curr_reading = curr_reading;
	}
	public String getCurr_reading_date() {
		return curr_reading_date;
	}
	public void setCurr_reading_date(String curr_reading_date) {
		this.curr_reading_date = curr_reading_date;
	}
	public Integer getDifference() {
		return difference;
	}
	public void setDifference(Integer difference) {
		this.difference = difference;
	}
	public Double getPressure() {
		return pressure;
	}
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	public Double getPressure_factor() {
		return pressure_factor;
	}
	public void setPressure_factor(Double pressure_factor) {
		this.pressure_factor = pressure_factor;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public Double getTemperature_factor() {
		return temperature_factor;
	}
	public void setTemperature_factor(Double temperature_factor) {
		this.temperature_factor = temperature_factor;
	}
	public long getActual_consumption() {
		return actual_consumption;
	}
	public void setActual_consumption(long actual_consumption) {
		this.actual_consumption = actual_consumption;
	}
	public Double getHhv_nhv() {
		return hhv_nhv;
	}
	public void setHhv_nhv(Double hhv_nhv) {
		this.hhv_nhv = hhv_nhv;
	}
	public Double getTotal_consumption() {
		return total_consumption;
	}
	public void setTotal_consumption(Double total_consumption) {
		this.total_consumption = total_consumption;
	}
	public Double getHhv_nhv_adjustment() {
		return hhv_nhv_adjustment;
	}
	public void setHhv_nhv_adjustment(Double hhv_nhv_adjustment) {
		this.hhv_nhv_adjustment = hhv_nhv_adjustment;
	}
	public String getTariff_id() {
		return tariff_id;
	}
	public void setTariff_id(String tariff_id) {
		this.tariff_id = tariff_id;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getMeter_rent() {
		return meter_rent;
	}
	public void setMeter_rent(Double meter_rent) {
		this.meter_rent = meter_rent;
	}
	public Double getMin_load() {
		return min_load;
	}
	public void setMin_load(Double min_load) {
		this.min_load = min_load;
	}
	public Double getMax_load() {
		return max_load;
	}
	public void setMax_load(Double max_load) {
		this.max_load = max_load;
	}
	public Double getPmin_load() {
		return pmin_load;
	}
	public void setPmin_load(Double pmin_load) {
		this.pmin_load = pmin_load;
	}
	public Double getPmax_load() {
		return pmax_load;
	}
	public void setPmax_load(Double pmax_load) {
		this.pmax_load = pmax_load;
	}
	public Integer getVat_rebate() {
		return vat_rebate;
	}
	public void setVat_rebate(Integer vat_rebate) {
		this.vat_rebate = vat_rebate;
	}

	@Override
	public String toString() {
		return "Reading [reading_id=" + reading_id + ", billing_month=" + billing_month + ", billing_year="
				+ billing_year + ", customer_id=" + customer_id + ", meter_id=" + meter_id + ", reading_purpose="
				+ reading_purpose + ", prev_reading=" + prev_reading + ", prev_reading_date=" + prev_reading_date
				+ ", curr_reading=" + curr_reading + ", curr_reading_date=" + curr_reading_date + ", difference="
				+ difference + ", pressure=" + pressure + ", pressure_factor=" + pressure_factor + ", temperature="
				+ temperature + ", temperature_factor=" + temperature_factor + ", actual_consumption="
				+ actual_consumption + ", hhv_nhv=" + hhv_nhv + ", total_consumption=" + total_consumption
				+ ", hhv_nhv_adjustment=" + hhv_nhv_adjustment + ", tariff_id=" + tariff_id + ", rate=" + rate
				+ ", meter_rent=" + meter_rent + ", min_load=" + min_load + ", max_load=" + max_load + ", pmin_load="
				+ pmin_load + ", pmax_load=" + pmax_load + ", vat_rebate=" + vat_rebate + "]";
	}	
	

}
