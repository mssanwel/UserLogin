
public class recordType {
	private String userName; 
	private String hashPassword; 
	private String name;
	private String email; 
	private String phone;
	private int failedLogin=0; 
	private boolean accountLocked=false; 
	
	// Set methods
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setHashPassword(String hashPassword) {
		this.hashPassword=hashPassword;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setFailedLogin(int failedLogin) {
		this.failedLogin=failedLogin;
	}
	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked=accountLocked;
	}
	// Get methods
	public String getUserName() {
		return this.userName;
	}
	public String getHashPassword() {
		return this.hashPassword;
	}
	public String getName() {
		return this.name;
	}
	public String setEmail() {
		return this.email;
	}
	public String setPhone() {
		return this.phone;
	}
	public int getFailedLogin() {
		return this.failedLogin;
	}
	public boolean setAccountLocked() {
		return this.accountLocked;
	}
}
