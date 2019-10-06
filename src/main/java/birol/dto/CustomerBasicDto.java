package birol.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "MVIEW_CUSTOMER_INFO")
public class CustomerBasicDto {

	@Id
	private String customer_id;
	private String app_sl_no;
	private Integer ismetered;
	private Integer connection_type;
	private String has_sub_connection;
	private String parent_connection;
	private Double min_load;
	private Double max_load;
	private Double hhv_nhv;
	private int pay_within_wo_sc;
	private int pay_within_w_sc;
	private String connection_date;
	private String ministry_id;
	private Integer vat_rebate;
	private Integer connection_status;
	private String full_name;
	private String father_name;
	private String mother_name;
	private String proprietor_name;
	private String organization_name;
	private String gender;
	private String email;
	private String phone;
	private String mobile;
	private String fax;
	private String freedom_fighter;
	private String waiver_appliance_id;
	private String national_id;
	private String passport_no;
	private String license_number;
	private String tin_no;
	private String vat_reg_no;
	private String category_id;
	private String category_name;
	private String category_type;
	private String road_house_no;
	private String post_office;
	private String post_code;
	private String address_line1;
	private String address_line2;
	private String division_id;
	private String division_name;
	private String dist_id;
	private String dist_name;
	private String upazila_id;
	private String upazila_name;
	private String ministry_name;
	private String area_id;
	private String area_name;
	private String address;
	private String created_on;
	private String created_by;
	private Integer status;
	private String zone;
	private String is_bulked;
	public CustomerBasicDto() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public CustomerBasicDto(String customer_id, String app_sl_no, Integer ismetered, Integer connection_type,
			String has_sub_connection, String parent_connection, Double min_load, Double max_load, Double hhv_nhv,
			int pay_within_wo_sc, int pay_within_w_sc, String connection_date, String ministry_id,
			Integer vat_rebate, Integer connection_status, String full_name, String father_name, String mother_name,
			String proprietor_name, String organization_name, String gender, String email, String phone, String mobile,
			String fax, String freedom_fighter, String waiver_appliance_id, String national_id, String passport_no,
			String license_number, String tin_no, String vat_reg_no, String category_id, String category_name,
			String category_type, String road_house_no, String post_office, String post_code, String address_line1,
			String address_line2, String division_id, String division_name, String dist_id, String dist_name,
			String upazila_id, String upazila_name, String ministry_name, String area_id, String area_name,
			String address, String created_on, String created_by, Integer status, String zone, String is_bulked) {
		super();
		this.customer_id = customer_id;
		this.app_sl_no = app_sl_no;
		this.ismetered = ismetered;
		this.connection_type = connection_type;
		this.has_sub_connection = has_sub_connection;
		this.parent_connection = parent_connection;
		this.min_load = min_load;
		this.max_load = max_load;
		this.hhv_nhv = hhv_nhv;
		this.pay_within_wo_sc = pay_within_wo_sc;
		this.pay_within_w_sc = pay_within_w_sc;
		this.connection_date = connection_date;
		this.ministry_id = ministry_id;
		this.vat_rebate = vat_rebate;
		this.connection_status = connection_status;
		this.full_name = full_name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.proprietor_name = proprietor_name;
		this.organization_name = organization_name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
		this.fax = fax;
		this.freedom_fighter = freedom_fighter;
		this.waiver_appliance_id = waiver_appliance_id;
		this.national_id = national_id;
		this.passport_no = passport_no;
		this.license_number = license_number;
		this.tin_no = tin_no;
		this.vat_reg_no = vat_reg_no;
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_type = category_type;
		this.road_house_no = road_house_no;
		this.post_office = post_office;
		this.post_code = post_code;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.division_id = division_id;
		this.division_name = division_name;
		this.dist_id = dist_id;
		this.dist_name = dist_name;
		this.upazila_id = upazila_id;
		this.upazila_name = upazila_name;
		this.ministry_name = ministry_name;
		this.area_id = area_id;
		this.area_name = area_name;
		this.address = address;
		this.created_on = created_on;
		this.created_by = created_by;
		this.status = status;
		this.zone = zone;
		this.is_bulked = is_bulked;
	}

	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getApp_sl_no() {
		return app_sl_no;
	}
	public void setApp_sl_no(String app_sl_no) {
		this.app_sl_no = app_sl_no;
	}
	public Integer getIsmetered() {
		return ismetered;
	}
	public void setIsmetered(Integer ismetered) {
		this.ismetered = ismetered;
	}
	public Integer getConnection_type() {
		return connection_type;
	}
	public void setConnection_type(Integer connection_type) {
		this.connection_type = connection_type;
	}
	public String getHas_sub_connection() {
		return has_sub_connection;
	}
	public void setHas_sub_connection(String has_sub_connection) {
		this.has_sub_connection = has_sub_connection;
	}
	public String getParent_connection() {
		return parent_connection;
	}
	public void setParent_connection(String parent_connection) {
		this.parent_connection = parent_connection;
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
	public Double getHhv_nhv() {
		return hhv_nhv;
	}
	public void setHhv_nhv(Double hhv_nhv) {
		this.hhv_nhv = hhv_nhv;
	}
	
	public int getPay_within_wo_sc() {
		return pay_within_wo_sc;
	}

	public void setPay_within_wo_sc(int pay_within_wo_sc) {
		this.pay_within_wo_sc = pay_within_wo_sc;
	}

	public int getPay_within_w_sc() {
		return pay_within_w_sc;
	}

	public void setPay_within_w_sc(int pay_within_w_sc) {
		this.pay_within_w_sc = pay_within_w_sc;
	}

	public String getConnection_date() {
		return connection_date;
	}
	public void setConnection_date(String connection_date) {
		this.connection_date = connection_date;
	}
	public String getMinistry_id() {
		return ministry_id;
	}
	public void setMinistry_id(String ministry_id) {
		this.ministry_id = ministry_id;
	}
	public Integer getVat_rebate() {
		return vat_rebate;
	}
	public void setVat_rebate(Integer vat_rebate) {
		this.vat_rebate = vat_rebate;
	}
	public Integer getConnection_status() {
		return connection_status;
	}
	public void setConnection_status(Integer connection_status) {
		this.connection_status = connection_status;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getProprietor_name() {
		return proprietor_name;
	}
	public void setProprietor_name(String proprietor_name) {
		this.proprietor_name = proprietor_name;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getFreedom_fighter() {
		return freedom_fighter;
	}
	public void setFreedom_fighter(String freedom_fighter) {
		this.freedom_fighter = freedom_fighter;
	}
	public String getWaiver_appliance_id() {
		return waiver_appliance_id;
	}
	public void setWaiver_appliance_id(String waiver_appliance_id) {
		this.waiver_appliance_id = waiver_appliance_id;
	}
	public String getNational_id() {
		return national_id;
	}
	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getTin_no() {
		return tin_no;
	}
	public void setTin_no(String tin_no) {
		this.tin_no = tin_no;
	}
	public String getVat_reg_no() {
		return vat_reg_no;
	}
	public void setVat_reg_no(String vat_reg_no) {
		this.vat_reg_no = vat_reg_no;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_type() {
		return category_type;
	}
	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}
	public String getRoad_house_no() {
		return road_house_no;
	}
	public void setRoad_house_no(String road_house_no) {
		this.road_house_no = road_house_no;
	}
	public String getPost_office() {
		return post_office;
	}
	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getDivision_id() {
		return division_id;
	}
	public void setDivision_id(String division_id) {
		this.division_id = division_id;
	}
	public String getDivision_name() {
		return division_name;
	}
	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}
	public String getDist_id() {
		return dist_id;
	}
	public void setDist_id(String dist_id) {
		this.dist_id = dist_id;
	}
	public String getDist_name() {
		return dist_name;
	}
	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}
	public String getUpazila_id() {
		return upazila_id;
	}
	public void setUpazila_id(String upazila_id) {
		this.upazila_id = upazila_id;
	}
	public String getUpazila_name() {
		return upazila_name;
	}
	public void setUpazila_name(String upazila_name) {
		this.upazila_name = upazila_name;
	}
	public String getMinistry_name() {
		return ministry_name;
	}
	public void setMinistry_name(String ministry_name) {
		this.ministry_name = ministry_name;
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
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getIs_bulked() {
		return is_bulked;
	}
	public void setIs_bulked(String is_bulked) {
		this.is_bulked = is_bulked;
	}

	@Override
	public String toString() {
		return "CustomerBasicDto [customer_id=" + customer_id + ", app_sl_no=" + app_sl_no + ", ismetered=" + ismetered
				+ ", connection_type=" + connection_type + ", has_sub_connection=" + has_sub_connection
				+ ", parent_connection=" + parent_connection + ", min_load=" + min_load + ", max_load=" + max_load
				+ ", hhv_nhv=" + hhv_nhv + ", pay_within_wo_sc=" + pay_within_wo_sc + ", pay_within_w_sc="
				+ pay_within_w_sc + ", connection_date=" + connection_date + ", ministry_id=" + ministry_id
				+ ", vat_rebate=" + vat_rebate + ", connection_status=" + connection_status + ", full_name=" + full_name
				+ ", father_name=" + father_name + ", mother_name=" + mother_name + ", proprietor_name="
				+ proprietor_name + ", organization_name=" + organization_name + ", gender=" + gender + ", email="
				+ email + ", phone=" + phone + ", mobile=" + mobile + ", fax=" + fax + ", freedom_fighter="
				+ freedom_fighter + ", waiver_appliance_id=" + waiver_appliance_id + ", national_id=" + national_id
				+ ", passport_no=" + passport_no + ", license_number=" + license_number + ", tin_no=" + tin_no
				+ ", vat_reg_no=" + vat_reg_no + ", category_id=" + category_id + ", category_name=" + category_name
				+ ", category_type=" + category_type + ", road_house_no=" + road_house_no + ", post_office="
				+ post_office + ", post_code=" + post_code + ", address_line1=" + address_line1 + ", address_line2="
				+ address_line2 + ", division_id=" + division_id + ", division_name=" + division_name + ", dist_id="
				+ dist_id + ", dist_name=" + dist_name + ", upazila_id=" + upazila_id + ", upazila_name=" + upazila_name
				+ ", ministry_name=" + ministry_name + ", area_id=" + area_id + ", area_name=" + area_name
				+ ", address=" + address + ", created_on=" + created_on + ", created_by=" + created_by + ", status="
				+ status + ", zone=" + zone + ", is_bulked=" + is_bulked + "]";
	}
	
	
	

}
