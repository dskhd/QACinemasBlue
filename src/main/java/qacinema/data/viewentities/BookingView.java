package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
@Entity
@Immutable
@Table(name="bookingsView")
@NamedQueries({
	@NamedQuery(query="SELECT b FROM BookingView b", name="BookingView.FIND_ALL"),
	//@NamedQuery(query="SELECT b FROM BookingView b WHERE b.userEmail = :user", name="BookingView.FIND_BY_NAME")
})
public class BookingView {
	
	public static final String FIND_ALL = "BookingView.findAllBookings";
	public static final String FIND_BY_USER = "BookingView.findByUser";
	
	@Id
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
