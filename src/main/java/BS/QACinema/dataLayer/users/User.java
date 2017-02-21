package dataLayer;

public class User {

	
	public User(){
		super();
	}	
	
	public User(String email, String password, String accountType, String firstName, String lastName, String telephone,
			boolean mailingList) {
		super();
		this.email = email;
		this.password = password;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.mailingList = mailingList;
	}
	
	
	private String email;
	private String password;
	private String accountType;
	private String firstName;
	private String lastName;
	private String telephone;
	private boolean mailingList;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public boolean getMailingList() {
		return mailingList;
	}
	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}
	
	
	
	
	
	
	
	
}
