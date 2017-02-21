package BS.QACinema.dataLayer.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;



@Table(name = "users")
@Entity
public class User {

	@Id
	private String email;
	@Column(name = "password")
	@NotNull
	private String password;
	@Column(name = "account")
	@NotNull
	private String accountType;
	@Column(name = "firstname")
	@NotNull
	private String firstName;
	@Column(name = "lastname")
	@NotNull
	private String lastName;
	@Column(name = "telephone")
	@NotNull
	private String telephone;
	@Column(name = "mailing_list")
	@NotNull
	private boolean mailingList;
	
	@ManyToMany
	@JoinTable(
	      name="user_has_addresses",
	      joinColumns = @JoinColumn(name="users_email", referencedColumnName="ID"),
	      inverseJoinColumns = @JoinColumn(name="address_addressId", referencedColumnName="ID"))
	  private List<Address> projects;
	
	
	
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
