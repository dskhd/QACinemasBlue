/*Author: Alex Dawkes*/
package qacinema.data.booking;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="bookings")
public class Booking {

	
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private String bookingid;
	
	@NotNull
	@Past
	@Column(name="time_booked")
	private String time_booked;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "users_email", nullable = false)
	private User user;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "payments_idpayments", nullable = false)
	private Payment payment;
	
	@NotNull
	@OneToMany
	@JoinColumn(name = "TicketID", nullable = false)
	private List<Ticket> tickets = new ArrayList<>();
		
	public Booking () {}
	public Booking(String bookingid, String time_booked, User user, Payment payment) {
		super();
		this.bookingid = bookingid;
		this.time_booked = time_booked;
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
		return time_booked;
	}
	public void setTime_booked(String time_booked) {
		this.time_booked = time_booked;
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
