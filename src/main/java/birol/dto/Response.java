package birol.dto;

public class Response {
	
	private String message;
	private long status;
	private String description;	
	
	
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Response(String message, long status, String description, String transactionId) {
		super();
		this.message = message;
		this.status = status;
		this.description = description;		
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description =description;
	}	

}
