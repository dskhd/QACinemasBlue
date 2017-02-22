package qa_cinema.data.booking.tickets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import qa_cinema.data.cinema.Seat;
import qa_cinema.data.cinema.Showing;




/**
 * @author AlexN
 */
@Entity
@Table(name = "tickets")
public class Ticket {

	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ticketID;

	@NotNull
	@ManyToOne
	@Column(name = "ticket_type_type", nullable = false)
	private String ticketType;

	@NotNull
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "seats_seat", nullable = false),
			@JoinColumn(name = "seats_screen_screenID", nullable = false) })
	private Seat seat;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "showing_showingID", nullable = false)
	private Showing showing;

	@NotNull
	@Column(name="price")
	private float price;
	

	public Ticket(String ticketID, TicketType ticketType, Seat seat, Showing showing) {
		this.ticketID = ticketID;
		this.ticketType = ticketType.getType();
		this.seat = seat;
		this.showing = showing;
	}

	public String getTicketID() {
		return ticketID;
	}

	public Seat getSeat() {
		return seat;
	}

	public Showing getShowing() {
		return showing;
	}

	public String getTicketType() {
		return ticketType;
	}
	
	public float getPrice(){
		return price;
	}
	
}