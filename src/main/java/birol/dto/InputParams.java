package birol.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InputParams{

	
	private String iBillFor;
	@Id
	private String iCustomerId;
	private String iCategoryId;
	private String iAreaId;
	private int iBillMonth;
	private int iBillYear;
	private String iIssueDate;
	private String iUserId;
	private String iRemarks;
	private String iReprocess;
	private int iBillType;
	
	
	
	public InputParams(String iBillFor, String iCustomerId, String iCategoryId, String iAreaId, int iBillMonth,
			int iBillYear, String iIssueDate, String iUserId, String iRemarks, String iReprocess, int iBillType) {
		super();
		this.iBillFor = iBillFor;
		this.iCustomerId = iCustomerId;
		this.iCategoryId = iCategoryId;
		this.iAreaId = iAreaId;
		this.iBillMonth = iBillMonth;
		this.iBillYear = iBillYear;
		this.iIssueDate = iIssueDate;
		this.iUserId = iUserId;
		this.iRemarks = iRemarks;
		this.iReprocess = iReprocess;
		this.iBillType = iBillType;
	}
	
	
	
	public InputParams() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getiBillFor() {
		return iBillFor;
	}
	public void setiBillFor(String iBillFor) {
		this.iBillFor = iBillFor;
	}
	public String getiCustomerId() {
		return iCustomerId;
	}
	public void setiCustomerId(String iCustomerId) {
		this.iCustomerId = iCustomerId;
	}
	public String getiCategoryId() {
		return iCategoryId;
	}
	public void setiCategoryId(String iCategoryId) {
		this.iCategoryId = iCategoryId;
	}
	public String getiAreaId() {
		return iAreaId;
	}
	public void setiAreaId(String iAreaId) {
		this.iAreaId = iAreaId;
	}
	public int getiBillMonth() {
		return iBillMonth;
	}
	public void setiBillMonth(int iBillMonth) {
		this.iBillMonth = iBillMonth;
	}
	public int getiBillYear() {
		return iBillYear;
	}
	public void setiBillYear(int iBillYear) {
		this.iBillYear = iBillYear;
	}
	public String getiIssueDate() {
		return iIssueDate;
	}
	public void setiIssueDate(String iIssueDate) {
		this.iIssueDate = iIssueDate;
	}
	public String getiUserId() {
		return iUserId;
	}
	public void setiUserId(String iUserId) {
		this.iUserId = iUserId;
	}
	public String getiRemarks() {
		return iRemarks;
	}
	public void setiRemarks(String iRemarks) {
		this.iRemarks = iRemarks;
	}
	public String getiReprocess() {
		return iReprocess;
	}
	public void setiReprocess(String iReprocess) {
		this.iReprocess = iReprocess;
	}
	public int getiBillType() {
		return iBillType;
	}
	public void setiBillType(int iBillType) {
		this.iBillType = iBillType;
	}
	
	

}
