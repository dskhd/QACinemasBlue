package qacinema.data.booking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.booking.tickets.CustomerType;
import qacinema.data.booking.tickets.DaysOfWeek;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.booking.tickets.TicketType;
import qacinema.data.booking.tickets.TimesOfDay;
import qacinema.data.cinema.Showing;
import qacinema.data.users.User;

public class BookingTest {

	private User testUser;
	private Payment testPayment;
	private Booking testBooking;
	private Payment testPayment2;
	private TicketType testTicketType;
	private Ticket testTicket;
	private Showing testShowing;
	private Ticket testTicket2;

	@Before
	public void setup() {
		testUser = new User("email", "password", "accountType", "firstname", "lastname", "telephone", false);
		testPayment = new Payment("1", "method", "cardnumber", "email");
		testBooking = new Booking("1", testUser, testPayment);
		testPayment2 = new Payment("2", "method2", "cardnumber2", "email2");
		testTicketType = new TicketType("child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);
		testShowing = new Showing();
		testTicket = new Ticket("1", testTicketType, testShowing);
		testTicket2 = new Ticket("2", testTicketType, testShowing);
	}

	@Test
	public void getBookingidTest() {
		assertEquals(testBooking.getBookingid(), "1");
	}
	@Test
	public void setBookingidTest() {
		testBooking.setBookingid("2");
		assertEquals(testBooking.getBookingid(), "2");
	}
	@Test
	public void getUserTest() {
		assertEquals(testBooking.getUser(), testUser);
	}
	@Test
	public void getPaymentTest() {
		assertEquals(testBooking.getPayment(), testPayment);
	}
	@Test
	public void setPaymentTest() {
		testBooking.setPayment(testPayment2);
		assertEquals(testBooking.getPayment(), testPayment2);
	}
	@Test
	public void getAndAddTicketsTest() {
		testBooking.addTicket(testTicket);
		assertEquals(testBooking.getTickets().size(), 1);
	}
	@Test
	public void removeTicketsTest() {
		testBooking.addTicket(testTicket);
		testBooking.addTicket(testTicket2);
		assertEquals(testBooking.getTickets().size(), 2);
		testBooking.removeTicket(testTicket2);
		assertEquals(testBooking.getTickets().size(), 1);
	}
}
