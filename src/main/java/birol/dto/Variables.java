package birol.dto;

public class Variables {
	
	private String billId;
	private String where_clause;
	private Double actual_consumption;
	private Long actual_consumption_rebate;
	private Long hhv_nhv_consumption;
	private Long other_consumption;
	private Long billed_consumption;	
	private String marginId;
	private Long tRate;
	private int tCnt;
	private Long tVatAmount ;
	private Long tSdAmount;
	private Long tOthersAmount;
	private Long tGovtAmount;
	private Long tPbGasBillAmount;
	private Long tPbAmount;
	private int tMeterId;
	private Long tMeterRent;
	private Long tBillAmount;
	private Long tTotalPayableAmount;
	private int tCount;
	private int tBillId4Reprocess;

	private String tcustomerName;
	private String tProprietorName;
	private int tCustomerCategory;
	private String tCustomerCategoryName;
	private String tCategoryType;
	private String tAreaId;
	private String tAreaName;
	private String tAddress;
	private String tPhone;
	private String tMobile;

	private Long tProportionalMinLoad;
	private Long tProportionalMaxLoad;
	private Long tActualMinLoad;
	private Long tBillForMinLoad;
	private Long tHhvNhvAmount;

	private Long tVatRebate;
	private Long tVatRebateAmount;
	private Long tHHVBillForPower;
	private Long tHHV;
	private Long tPowerRate;
	private Long tConsumption;

	private Long tPrice;
	private Long tPbRate;
	private Long tVatRate;
	private Long tSdRate;
	private Long tOtherRate;
	private int tReadingId;
	private int tLockStatus;
	private int tTotalReadingRecord;
	private String tAmountInWord;
	private boolean isMinBill;
	private int l_start;
	private int l_end;
	private int l_diff;

	private int holiday_counter;
	private String initialpaydate;
	private String pay_date_holder;
	private String payDate_within_wo_sc;
	private String payDate_within_wo_sc_view;
	private String payDate_within_w_sc;
	private String payDate_within_w_sc_view;

	private String dueDaten;
	
	private Long tMixedConsumption;
	
	

	public Long gettMixedConsumption() {
		return tMixedConsumption;
	}

	public void settMixedConsumption(Long tMixedConsumption) {
		this.tMixedConsumption = tMixedConsumption;
	}

	public String getWhere_clause() {
		return where_clause;
	}

	public void setWhere_clause(String where_clause) {
		this.where_clause = where_clause;
	}

	public Double getActual_consumption() {
		return actual_consumption;
	}

	public void setActual_consumption(Double double1) {
		this.actual_consumption = double1;
	}

	public Long getActual_consumption_rebate() {
		return actual_consumption_rebate;
	}

	public void setActual_consumption_rebate(Long actual_consumption_rebate) {
		this.actual_consumption_rebate = actual_consumption_rebate;
	}

	public Long getHhv_nhv_consumption() {
		return hhv_nhv_consumption;
	}

	public void setHhv_nhv_consumption(Long hhv_nhv_consumption) {
		this.hhv_nhv_consumption = hhv_nhv_consumption;
	}

	public Long getOther_consumption() {
		return other_consumption;
	}

	public void setOther_consumption(Long other_consumption) {
		this.other_consumption = other_consumption;
	}

	public Long getBilled_consumption() {
		return billed_consumption;
	}

	public void setBilled_consumption(Long billed_consumption) {
		this.billed_consumption = billed_consumption;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getMarginId() {
		return marginId;
	}

	public void setMarginId(String marginId) {
		this.marginId = marginId;
	}

	public Long gettRate() {
		return tRate;
	}

	public void settRate(Long tRate) {
		this.tRate = tRate;
	}

	public int gettCnt() {
		return tCnt;
	}

	public void settCnt(int tCnt) {
		this.tCnt = tCnt;
	}

	public Long gettVatAmount() {
		return tVatAmount;
	}

	public void settVatAmount(Long tVatAmount) {
		this.tVatAmount = tVatAmount;
	}

	public Long gettSdAmount() {
		return tSdAmount;
	}

	public void settSdAmount(Long tSdAmount) {
		this.tSdAmount = tSdAmount;
	}

	public Long gettOthersAmount() {
		return tOthersAmount;
	}

	public void settOthersAmount(Long tOthersAmount) {
		this.tOthersAmount = tOthersAmount;
	}

	public Long gettGovtAmount() {
		return tGovtAmount;
	}

	public void settGovtAmount(Long tGovtAmount) {
		this.tGovtAmount = tGovtAmount;
	}

	public Long gettPbGasBillAmount() {
		return tPbGasBillAmount;
	}

	public void settPbGasBillAmount(Long tPbGasBillAmount) {
		this.tPbGasBillAmount = tPbGasBillAmount;
	}

	public Long gettPbAmount() {
		return tPbAmount;
	}

	public void settPbAmount(Long tPbAmount) {
		this.tPbAmount = tPbAmount;
	}

	public int gettMeterId() {
		return tMeterId;
	}

	public void settMeterId(int tMeterId) {
		this.tMeterId = tMeterId;
	}

	public Long gettMeterRent() {
		return tMeterRent;
	}

	public void settMeterRent(Long tMeterRent) {
		this.tMeterRent = tMeterRent;
	}

	public Long gettBillAmount() {
		return tBillAmount;
	}

	public void settBillAmount(Long tBillAmount) {
		this.tBillAmount = tBillAmount;
	}

	public Long gettTotalPayableAmount() {
		return tTotalPayableAmount;
	}

	public void settTotalPayableAmount(Long tTotalPayableAmount) {
		this.tTotalPayableAmount = tTotalPayableAmount;
	}

	public int gettCount() {
		return tCount;
	}

	public void settCount(int tCount) {
		this.tCount = tCount;
	}

	public int gettBillId4Reprocess() {
		return tBillId4Reprocess;
	}

	public void settBillId4Reprocess(int tBillId4Reprocess) {
		this.tBillId4Reprocess = tBillId4Reprocess;
	}

	public String getTcustomerName() {
		return tcustomerName;
	}

	public void setTcustomerName(String tcustomerName) {
		this.tcustomerName = tcustomerName;
	}

	public String gettProprietorName() {
		return tProprietorName;
	}

	public void settProprietorName(String tProprietorName) {
		this.tProprietorName = tProprietorName;
	}

	public int gettCustomerCategory() {
		return tCustomerCategory;
	}

	public void settCustomerCategory(int tCustomerCategory) {
		this.tCustomerCategory = tCustomerCategory;
	}

	public String gettCustomerCategoryName() {
		return tCustomerCategoryName;
	}

	public void settCustomerCategoryName(String tCustomerCategoryName) {
		this.tCustomerCategoryName = tCustomerCategoryName;
	}

	public String gettCategoryType() {
		return tCategoryType;
	}

	public void settCategoryType(String tCategoryType) {
		this.tCategoryType = tCategoryType;
	}

	public String gettAreaId() {
		return tAreaId;
	}

	public void settAreaId(String tAreaId) {
		this.tAreaId = tAreaId;
	}

	public String gettAreaName() {
		return tAreaName;
	}

	public void settAreaName(String tAreaName) {
		this.tAreaName = tAreaName;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public String gettMobile() {
		return tMobile;
	}

	public void settMobile(String tMobile) {
		this.tMobile = tMobile;
	}

	public Long gettProportionalMinLoad() {
		return tProportionalMinLoad;
	}

	public void settProportionalMinLoad(Long tProportionalMinLoad) {
		this.tProportionalMinLoad = tProportionalMinLoad;
	}

	public Long gettProportionalMaxLoad() {
		return tProportionalMaxLoad;
	}

	public void settProportionalMaxLoad(Long tProportionalMaxLoad) {
		this.tProportionalMaxLoad = tProportionalMaxLoad;
	}

	public Long gettActualMinLoad() {
		return tActualMinLoad;
	}

	public void settActualMinLoad(Long tActualMinLoad) {
		this.tActualMinLoad = tActualMinLoad;
	}

	public Long gettBillForMinLoad() {
		return tBillForMinLoad;
	}

	public void settBillForMinLoad(Long tBillForMinLoad) {
		this.tBillForMinLoad = tBillForMinLoad;
	}

	public Long gettHhvNhvAmount() {
		return tHhvNhvAmount;
	}

	public void settHhvNhvAmount(Long tHhvNhvAmount) {
		this.tHhvNhvAmount = tHhvNhvAmount;
	}

	public Long gettVatRebate() {
		return tVatRebate;
	}

	public void settVatRebate(Long tVatRebate) {
		this.tVatRebate = tVatRebate;
	}

	public Long gettVatRebateAmount() {
		return tVatRebateAmount;
	}

	public void settVatRebateAmount(Long tVatRebateAmount) {
		this.tVatRebateAmount = tVatRebateAmount;
	}

	public Long gettHHVBillForPower() {
		return tHHVBillForPower;
	}

	public void settHHVBillForPower(Long tHHVBillForPower) {
		this.tHHVBillForPower = tHHVBillForPower;
	}

	public Long gettHHV() {
		return tHHV;
	}

	public void settHHV(Long tHHV) {
		this.tHHV = tHHV;
	}

	public Long gettPowerRate() {
		return tPowerRate;
	}

	public void settPowerRate(Long tPowerRate) {
		this.tPowerRate = tPowerRate;
	}

	public Long gettConsumption() {
		return tConsumption;
	}

	public void settConsumption(Long tConsumption) {
		this.tConsumption = tConsumption;
	}

	public Long gettPrice() {
		return tPrice;
	}

	public void settPrice(Long tPrice) {
		this.tPrice = tPrice;
	}

	public Long gettPbRate() {
		return tPbRate;
	}

	public void settPbRate(Long tPbRate) {
		this.tPbRate = tPbRate;
	}

	public Long gettVatRate() {
		return tVatRate;
	}

	public void settVatRate(Long tVatRate) {
		this.tVatRate = tVatRate;
	}

	public Long gettSdRate() {
		return tSdRate;
	}

	public void settSdRate(Long tSdRate) {
		this.tSdRate = tSdRate;
	}

	public Long gettOtherRate() {
		return tOtherRate;
	}

	public void settOtherRate(Long tOtherRate) {
		this.tOtherRate = tOtherRate;
	}

	public int gettReadingId() {
		return tReadingId;
	}

	public void settReadingId(int tReadingId) {
		this.tReadingId = tReadingId;
	}

	public int gettLockStatus() {
		return tLockStatus;
	}

	public void settLockStatus(int tLockStatus) {
		this.tLockStatus = tLockStatus;
	}

	public int gettTotalReadingRecord() {
		return tTotalReadingRecord;
	}

	public void settTotalReadingRecord(int tTotalReadingRecord) {
		this.tTotalReadingRecord = tTotalReadingRecord;
	}

	public String gettAmountInWord() {
		return tAmountInWord;
	}

	public void settAmountInWord(String tAmountInWord) {
		this.tAmountInWord = tAmountInWord;
	}

	public boolean isMinBill() {
		return isMinBill;
	}

	public void setMinBill(boolean isMinBill) {
		this.isMinBill = isMinBill;
	}

	public int getL_start() {
		return l_start;
	}

	public void setL_start(int l_start) {
		this.l_start = l_start;
	}

	public int getL_end() {
		return l_end;
	}

	public void setL_end(int l_end) {
		this.l_end = l_end;
	}

	public int getL_diff() {
		return l_diff;
	}

	public void setL_diff(int l_diff) {
		this.l_diff = l_diff;
	}

	public int getHoliday_counter() {
		return holiday_counter;
	}

	public void setHoliday_counter(int holiday_counter) {
		this.holiday_counter = holiday_counter;
	}

	public String getInitialpaydate() {
		return initialpaydate;
	}

	public void setInitialpaydate(String initialpaydate) {
		this.initialpaydate = initialpaydate;
	}

	public String getPay_date_holder() {
		return pay_date_holder;
	}

	public void setPay_date_holder(String pay_date_holder) {
		this.pay_date_holder = pay_date_holder;
	}

	public String getPayDate_within_wo_sc() {
		return payDate_within_wo_sc;
	}

	public void setPayDate_within_wo_sc(String payDate_within_wo_sc) {
		this.payDate_within_wo_sc = payDate_within_wo_sc;
	}

	public String getPayDate_within_wo_sc_view() {
		return payDate_within_wo_sc_view;
	}

	public void setPayDate_within_wo_sc_view(String payDate_within_wo_sc_view) {
		this.payDate_within_wo_sc_view = payDate_within_wo_sc_view;
	}

	public String getPayDate_within_w_sc() {
		return payDate_within_w_sc;
	}

	public void setPayDate_within_w_sc(String payDate_within_w_sc) {
		this.payDate_within_w_sc = payDate_within_w_sc;
	}

	public String getPayDate_within_w_sc_view() {
		return payDate_within_w_sc_view;
	}

	public void setPayDate_within_w_sc_view(String payDate_within_w_sc_view) {
		this.payDate_within_w_sc_view = payDate_within_w_sc_view;
	}

	public String getDueDaten() {
		return dueDaten;
	}

	public void setDueDaten(String dueDaten) {
		this.dueDaten = dueDaten;
	}

	
	
}
