/*Author: Alex Dawkes*/
package qacinema.data.booking;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import qacinema.data.users.User;

@Entity
@Table(name = "payments")

@NamedQueries({
	@NamedQuery(query = "SELECT p FROM Payment p WHERE p.paymentsid = :name", name="Stock.FIND_BY_NAME"),
	@NamedQuery(name = "Payment.FIND_ALL", query = "SELECT p FROM Payment p"),
})

public class Payment {
	
	public static final String 	FIND_BY_PAYMENT_ID = "Payment.findByPaymentID", 
								FIND_ALL = "Payment.findAll";

	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "paymentsid", nullable = false , unique=true,insertable=true)
	private String paymentsid;

	
	@Column(name = "method", nullable = true)
	private String method;

	
	@Column(name = "cardnumber", nullable = true)
	private String cardnumber;

	
	@Column(name = "email_address", nullable = true)
	private String email_address;
	
	
	@ManyToMany
	@JoinTable(name="user_has_payments",
	      joinColumns=@JoinColumn(name="paymentIds", referencedColumnName="paymentsID"),
	      inverseJoinColumns=@JoinColumn(name="userEmails", referencedColumnName="email"))
	private List<User> users;

	public Payment() {
		
	}

	public Payment(String paymentsid, String method, String cardnumber, String email_address) {
		super();
		this.paymentsid = paymentsid;
		this.method = method;
		this.cardnumber = cardnumber;
		this.email_address = email_address;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getPaymentsid() {
		return paymentsid;
	}

	public void setPaymentsid(String paymentsid) {
		this.paymentsid = paymentsid;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

}
