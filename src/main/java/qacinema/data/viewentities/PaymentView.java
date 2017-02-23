package qacinema.data.viewentities;

import javax.persistence.Column;

public class PaymentView {
	
	@Column 
	String paymentsID;
	
	@Column 
	String method;
	
	@Column 
	String cardNumber;
	
	@Column 
	boolean isPaid;
	
	@Column 
	String bookingID;
	
	@Column 
	String email;
	
	@Column 
	String fullName;

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
