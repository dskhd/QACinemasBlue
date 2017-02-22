/*Author: Alex Dawkes*/
package qa_cinema.data.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "payments")
public class Payment {

	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "paymentsid", nullable = false,insertable=true, scale=91)
	private int paymentsid;

	
	@Column(name = "method", nullable = true)
	private String method;

	
	@Column(name = "cardnumber", nullable = true)
	private String cardnumber;

	
	@Column(name = "email_address", nullable = true)
	private String email_address;

	public Payment() {}

	public Payment(int paymentsid, String method, boolean isPaid, String cardnumber, String email_address) {
		super();
		this.paymentsid = paymentsid;
		this.method = method;
		this.cardnumber = cardnumber;
		this.email_address = email_address;
	}

	public int getPaymentsid() {
		return paymentsid;
	}

	public void setPaymentsid(int paymentsid) {
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
