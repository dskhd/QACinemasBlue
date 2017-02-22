package qa_cinema.data.booking;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.booking.tickets.TicketType;
import qa_cinema.data.cinema.Seat;
import qa_cinema.data.cinema.Showing;
import qa_cinema.test_data.TestData;

public class TicketTest {

	@Inject private TestData testData = TestData.getData();
	private Ticket ticket;
	private TicketType ticketType;
	private Seat seat;
	private Showing showing;
	
	
	

	@Before
	public void setup() {
		ticket = testData.ticket;
		ticketType = testData.ticketType;
		seat = testData.seat;
		showing = testData.showing;
		
	}

	@Test
	public void testGetTicketType() {
		assertEquals(ticketType, ticket.getTicketType());
	}
	
	@Test
	public void testGetShowing() {
		assertEquals(showing, ticket.getShowing());
	}
	
	@Test
	public void testGetSeat() {
		assertEquals(seat, ticket.getSeat());
	}
	
	@Test
	public void testGetPrice(){
		float price = ticketType.getPrice();
		assertEquals(price, ticket.getPrice(), 0.001);
	}
	
	@Test
	public void testGetId(){
		assertEquals("1", ticket.getTicketID());
	}
}
