package birol.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_b")
public class Test_b {

	@Id
	private String bill_no;
	private long amount;
	public Test_b() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
