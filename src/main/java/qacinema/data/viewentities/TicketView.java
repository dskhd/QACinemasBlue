package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;



@Entity @Table(name="ticketView")
@Immutable
public class TicketView {
	
	@Id
	@Column 	
	private String ticketID;
	
	@Column 
	private String ticketType;
	
	@Column 
	private double price;
	
	@Column 
	private String bookingsID;
	
	@Column 
	private String screenID;
	
	@Column 
	private String seat; //int?
	
	@Column 
	private  String showTime;

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
