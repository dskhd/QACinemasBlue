/**
 * Created by Mark Lester
 * Editor Matt Gordon
 */

package qacinema.data.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import qacinema.data.booking.Booking;
import qacinema.data.booking.Payment;

@Table(name = "users")
@Entity
public class User {

	@Id
	private String email;
	
	@Column(name = "password")
	@NotNull
	private String password;
	
	@Column(name = "accountType")
	@NotNull
	private String accountType;
	
	@Column(name = "firstMame")
	@NotNull
	private String firstName;
	
	@Column(name = "lastName")
	@NotNull
	private String lastName;
	
	@Column(name = "telephone")
	@NotNull
	private String telephone;
	
	@Column(name = "mailingList")
	@NotNull
	private boolean mailingList;

	@Column(name = "userAlias")
	@NotNull
	private String alias;
	
	@Column(name = "dob")
	@NotNull
	private String dob;
		
	@OneToMany(mappedBy = "reviewer")
	private List<UserRating> ratings;

	@OneToMany(mappedBy = "user")
	private List<UserHaveAddresses> userHasAddresses;
	
	@ManyToMany
	@JoinTable(name="user_has_payments",
	      joinColumns=@JoinColumn(name="userEmails", referencedColumnName="email"),
	      inverseJoinColumns=@JoinColumn(name="paymentIds", referencedColumnName="paymentsID"))
	private List<Payment> payments;
	
	@OneToMany(mappedBy = "user")
	private List<Booking> bookings;
	
	public User() {
		super();
	}

	public User(String email, String password, String accountType, String firstName, String lastName, String telephone, boolean mailingList) {
		super();
		this.email = email;
		this.password = password;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.mailingList = mailingList;
	}

	public List<UserRating> getRatings() {
		return ratings;
	}
	
	public void setRatings(List<UserRating> ratings) {
		this.ratings = ratings;
	}

	public List<UserHaveAddresses> getUserHasAddresses() {
		return userHasAddresses;
	}
	
	public void setUserHasAddresses(List<UserHaveAddresses> userHasAddresses) {
		this.userHasAddresses = userHasAddresses;
	}
	
	public List<Payment> getPayments() {
		return payments;
	}
	
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Booking> getBookings() {
		return bookings;
	}
	
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
