package encapsulation;

public class Test0 {
	private String emailId="bharani@gmail.com";
	private int password=12345;
	
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}
	
	
}
