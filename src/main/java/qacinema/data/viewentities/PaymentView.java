package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity @Table(name="paymentView")
@Immutable
public class PaymentView {
	
	@Id
	@Column 
	private String paymentsID;
	
	@Column 
	private String method;
	
	@Column 
	private String cardNumber;
	
	@Column 
	private boolean isPaid;
	
	@Column 
	private String bookingID;
	
	@Column 
	private String email;
	
	@Column 
	private String fullName;

	
	
	
	
	public String getPaymentsID() {
		return paymentsID;
	}

	public String getMethod() {
		return method;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public String getBookingID() {
		return bookingID;
	}

	public String getEmail() {
		return email;
	}

	public String getFullName() {
		return fullName;
	}

}
