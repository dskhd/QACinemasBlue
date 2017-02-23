package qacinema.data.viewentities;

import javax.persistence.Column;

public class BookingView {
	
	@Column
	private String bookingID;
	
	@Column
	private String timeBooked; //is this a date type?
	
	@Column
	private String userName;
	
	@Column
	private int numberOfTickets;
	
	@Column
	private double totalPrice;

	public String getBookingID() {
		return bookingID;
	}

	public String getTimeBooked() {
		return timeBooked;
	}

	public String getUserName() {
		return userName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
