package birol.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_TARIFF")
public class TariffDTO {
	@Id
	private String tariff_id;
	private String tariff_no;
	private String customer_category_id;
	private Integer meter_status;
	private String burner_category;
	private Double price;
	private Double pb;
	private Double vat;
	private Double sd;
	private Double other;
	private Double pdf;
	private Double bapex;
	private Double wellhead;
	private Double dwellhead;
	private Double trnsmission;
	private Double gdfund;
	private Double distribution;
	private Double avalue;
	private Double other1;
	private Double other2;
	private String description;
	private String entry_date;
	private String effective_from;
	private String effective_to;
	private Integer is_default;
	public TariffDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TariffDTO(String tariff_id, String tariff_no, String customer_category_id, Integer meter_status,
			String burner_category, Double price, Double pb, Double vat, Double sd, Double other, Double pdf,
			Double bapex, Double wellhead, Double dwellhead, Double trnsmission, Double gdfund, Double distribution,
			Double avalue, Double other1, Double other2, String description, String entry_date, String effective_from,
			String effective_to, Integer is_default) {
		super();
		this.tariff_id = tariff_id;
		this.tariff_no = tariff_no;
		this.customer_category_id = customer_category_id;
		this.meter_status = meter_status;
		this.burner_category = burner_category;
		this.price = price;
		this.pb = pb;
		this.vat = vat;
		this.sd = sd;
		this.other = other;
		this.pdf = pdf;
		this.bapex = bapex;
		this.wellhead = wellhead;
		this.dwellhead = dwellhead;
		this.trnsmission = trnsmission;
		this.gdfund = gdfund;
		this.distribution = distribution;
		this.avalue = avalue;
		this.other1 = other1;
		this.other2 = other2;
		this.description = description;
		this.entry_date = entry_date;
		this.effective_from = effective_from;
		this.effective_to = effective_to;
		this.is_default = is_default;
	}
	
	public String getTariff_id() {
		return tariff_id;
	}
	public void setTariff_id(String tariff_id) {
		this.tariff_id = tariff_id;
	}
	public String getTariff_no() {
		return tariff_no;
	}
	public void setTariff_no(String tariff_no) {
		this.tariff_no = tariff_no;
	}
	public String getCustomer_category_id() {
		return customer_category_id;
	}
	public void setCustomer_category_id(String customer_category_id) {
		this.customer_category_id = customer_category_id;
	}
	public Integer getMeter_status() {
		return meter_status;
	}
	public void setMeter_status(Integer meter_status) {
		this.meter_status = meter_status;
	}
	public String getBurner_category() {
		return burner_category;
	}
	public void setBurner_category(String burner_category) {
		this.burner_category = burner_category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPb() {
		return pb;
	}
	public void setPb(Double pb) {
		this.pb = pb;
	}
	public Double getVat() {
		return vat;
	}
	public void setVat(Double vat) {
		this.vat = vat;
	}
	public Double getSd() {
		return sd;
	}
	public void setSd(Double sd) {
		this.sd = sd;
	}
	public Double getOther() {
		return other;
	}
	public void setOther(Double other) {
		this.other = other;
	}
	public Double getPdf() {
		return pdf;
	}
	public void setPdf(Double pdf) {
		this.pdf = pdf;
	}
	public Double getBapex() {
		return bapex;
	}
	public void setBapex(Double bapex) {
		this.bapex = bapex;
	}
	public Double getWellhead() {
		return wellhead;
	}
	public void setWellhead(Double wellhead) {
		this.wellhead = wellhead;
	}
	public Double getDwellhead() {
		return dwellhead;
	}
	public void setDwellhead(Double dwellhead) {
		this.dwellhead = dwellhead;
	}
	public Double getTrnsmission() {
		return trnsmission;
	}
	public void setTrnsmission(Double trnsmission) {
		this.trnsmission = trnsmission;
	}
	public Double getGdfund() {
		return gdfund;
	}
	public void setGdfund(Double gdfund) {
		this.gdfund = gdfund;
	}
	public Double getDistribution() {
		return distribution;
	}
	public void setDistribution(Double distribution) {
		this.distribution = distribution;
	}
	public Double getAvalue() {
		return avalue;
	}
	public void setAvalue(Double avalue) {
		this.avalue = avalue;
	}
	public Double getOther1() {
		return other1;
	}
	public void setOther1(Double other1) {
		this.other1 = other1;
	}
	public Double getOther2() {
		return other2;
	}
	public void setOther2(Double other2) {
		this.other2 = other2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}
	public String getEffective_from() {
		return effective_from;
	}
	public void setEffective_from(String effective_from) {
		this.effective_from = effective_from;
	}
	public String getEffective_to() {
		return effective_to;
	}
	public void setEffective_to(String effective_to) {
		this.effective_to = effective_to;
	}
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}
	
	

}
