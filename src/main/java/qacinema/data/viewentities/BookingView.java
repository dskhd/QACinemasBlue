package qacinema.data.viewentities;

import javax.persistence.Column;

public class BookingView {
	
	@Column
	String bookingID;
	
	@Column
	String timeBooked; //is this a date type?
	
	@Column
	String userName;
	
	@Column
	int numberOfTickets;
	
	@Column
	double totalPrice;

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
