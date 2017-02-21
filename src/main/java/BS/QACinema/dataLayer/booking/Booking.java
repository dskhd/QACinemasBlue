package BS.QACinema.dataLayer.booking;

import javax.validation.constraints.NotNull;

public class Booking {

	
	@NotNull
	private int bookingid;
	private String time_booked;
	private String users_email;
	private int payments_idpayments;
		
	public Booking () {}
	public Booking(int bookingid, String time_booked, String users_email, int payments_idpayments) {
		super();
		this.bookingid = bookingid;
		this.time_booked = time_booked;
		this.users_email = users_email;
		this.payments_idpayments = payments_idpayments;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getTime_booked() {
		return time_booked;
	}
	public void setTime_booked(String time_booked) {
		this.time_booked = time_booked;
	}
	public String getUsers_email() {
		return users_email;
	}
	public void setUsers_email(String users_email) {
		this.users_email = users_email;
	}
	public int getPayments_idpayments() {
		return payments_idpayments;
	}
	public void setPayments_idpayments(int payments_idpayments) {
		this.payments_idpayments = payments_idpayments;
	}
	
	
	
	
}
