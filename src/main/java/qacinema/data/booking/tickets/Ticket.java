package qacinema.data.booking.tickets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;

/**
 * @author AlexN
 */
@Entity
@Table(name = "ticket")
@NamedQueries({
	@NamedQuery(query="SELECT t FROM TicketView t WHERE t.ticketID = :id", name="Ticket.FIND_BY_ID"),
	//@NamedQuery(query="SELECT tickets FROM Booking b WHERE b.user = :userEmail ", name = "Ticket.FIND_ALL_BY_USER"),
	//@NamedQuery(query="SELECT t from Ticket t where t.showing.film.flimdID=:filmID", name="Ticket.FIND_ALL_BY_FILM")
})
public class Ticket {
	
	public static final String FIND_BY_ID = "Ticket.FIND_BY_ID";
	public static final String FIND_ALL_BY_USER = "Ticket.FIND_ALL_BY_USER";
	public static final String FIND_ALL_BY_FILM = "Ticket.FIND_ALL_BY_FILM";

	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ticketID;

	@NotNull
	private String ticketType;

	
	//TODO - FIX THIS BIT!
	@NotNull
	@JoinColumn(name = "seatID")
	private Seat seat;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "showing_showingID", nullable = false)
	private Showing showing;

	@NotNull
	@Column(name="price")
	private float price;
	

	public Ticket(String ticketID, TicketType ticketType, Showing showing) {
		this.ticketID = ticketID;
		this.ticketType = ticketType.getType();
		this.showing = showing;
		
		this.price = ticketType.getPrice();
	}
	
	public Ticket() {
	}

	public void setID(String id){
		this.ticketID = id;
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
	
	public void setSeat(Seat seat){
		this.seat = seat;
	}
	
}