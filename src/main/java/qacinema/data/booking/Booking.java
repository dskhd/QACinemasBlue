/*Author: Alex Dawkes*/
package qacinema.data.booking;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;
import qacinema.service.managers.offline.QACinemaUtilities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.text.Utilities;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="bookings")
@NamedQueries({
	@NamedQuery(query="SELECT b FROM bookings b", name="Booking.FIND_ALL"),
	@NamedQuery(query="SELECT b FROM bookings b WHERE b.userEmail = :user", name="Booking.FIND_BY_NAME"),
	@NamedQuery(query="SELECT b FROM bookings b WHERE b.paymentsID = :paymentid", name="Booking.FIND_BY_PAYMENTID")
})
public class Booking {

	public static final String FIND_ALL = "Booking.findAllBookings";
	public static final String FIND_BY_USER = "Booking.findByUser";
	public static final String FIND_BY_PAYMENTID = "Booking.findByPaymentID";
	
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="bookingID", nullable = false, unique = true)
	private String bookingid;
	
	@NotNull
	@Past
	@Column(name="timeBooked")
	private String timeBooked;
	
	@NotNull
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "userEmail", nullable = false)
	private User user;
	
	@NotNull
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "paymentsID", nullable = false)
	private Payment payment;
	
	@NotNull
	@OneToMany
	@JoinColumn(name = "TicketID", nullable = false)
	private List<Ticket> tickets = new ArrayList<>();
		
	public Booking () {}
	public Booking(String bookingid, User user, Payment payment) {
		super();
		this.bookingid = bookingid;
		this.timeBooked = QACinemaUtilities.getDate();
		this.user = user;
		this.payment = payment;
		}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getTime_booked() {
		return timeBooked;
	}
	public void setTime_booked(String timeBooked) {
		this.timeBooked = timeBooked;
	}
	public User getUser() {
		return user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void addTicket(Ticket ticket){
		tickets.add(ticket);	
	}
	public void removeTicket(Ticket ticket){
		tickets.remove(ticket);
	}
	
	
}
