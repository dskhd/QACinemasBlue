/*Author: Alex Dawkes*/
package qacinema.data.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "payments")

@NamedQueries({
	@NamedQuery(query = "SELECT p FROM payment p WHERE p.name = :name", name="Stock.FIND_BY_NAME"),
	@NamedQuery(name = "Payment.FIND_ALL", query = "SELECT p FROM payment p"),
})

public class Payment {
	
	public static final String 	FIND_BY_NAME = "Payment.findByPaymentID", 
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

	public Payment() {}

	public Payment(String paymentsid, String method, String cardnumber, String email_address) {
		super();
		this.paymentsid = paymentsid;
		this.method = method;
		this.cardnumber = cardnumber;
		this.email_address = email_address;
	}
	
	/*
	//@Override
	public List<Payment> findByPaymentID(String name) {
		TypedQuery<Payment> query = entityManager.createNamedQuery(Payment.FIND_BY_NAME, Payment.class);
		query.setParameter("name", name);
		return query.getResultList();
	}
	*/

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
