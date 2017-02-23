package qacinema.data.viewentities;

import javax.persistence.Column;

public class TicketView {
	
	@Column 	
	String ticketID;
	
	@Column 
	String ticketType;
	
	@Column 
	double price;
	
	@Column 
	String bookingsID;
	
	@Column 
	String screenID;
	
	@Column 
	String seat; //int?
	
	@Column 
	String showTime;

	public String getTicketID() {
		return ticketID;
	}

	public String getTicketType() {
		return ticketType;
	}

	public double getPrice() {
		return price;
	}

	public String getBookingsID() {
		return bookingsID;
	}

	public String getScreenID() {
		return screenID;
	}

	public String getSeat() {
		return seat;
	}

	public String getShowTime() {
		return showTime;
	}
	

}
