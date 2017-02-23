package qacinema.data.booking.tickets;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;

public class TicketTest {
	
	private Ticket ticket;
	private TicketType ticketType = new TicketType("Child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);;
	private Showing showing = new Showing("1", null, null, null, null, null);
	

	@Before
	public void setUp() {
		
		ticket = new Ticket("1", ticketType, showing);
	}

	@Test
	public void testSetID() {
		ticket.setID("2");
		assertEquals("2", ticket.getTicketID());
	}
	
	@Test
	public void testGetID() {
		assertEquals("1", ticket.getTicketID());
	}
	
	@Test
	public void testSetSeat() {
		Seat seat = new Seat("A12", "Regular");
		ticket.setSeat(seat);
		assertEquals(seat, ticket.getSeat());
	}
	
	@Test
	public void testGetShowing() {
		assertEquals(showing, ticket.getShowing());
	}
	
	@Test
	public void testGetTicketType() {
		assertEquals(ticketType.getType(), ticket.getTicketType());
	}
	
	@Test
	public void testGetTicketPrice(){
		assertEquals(ticketType.getPrice(), ticket.getPrice(), 0.001);
	}
	
}
