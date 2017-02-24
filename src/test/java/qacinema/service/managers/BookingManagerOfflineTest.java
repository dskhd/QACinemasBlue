package qacinema.service.managers;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.booking.Booking;
import qacinema.data.booking.Payment;
import qacinema.data.booking.tickets.CustomerType;
import qacinema.data.booking.tickets.DaysOfWeek;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.booking.tickets.TicketType;
import qacinema.data.booking.tickets.TimesOfDay;
import qacinema.data.cinema.Showing;
import qacinema.data.users.User;
import qacinema.service.managers.offline.OfflineBookingManager;
import qacinema.testdata.TestData;

public class BookingManagerOfflineTest {

	@Inject
	private TestData testData;
	private OfflineBookingManager obm;
	
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
		testData = new TestData();
		testUser = new User("email", "password", "accountType", "firstname", "lastname", "telephone", false);
		testPayment = new Payment("1", "method", "cardnumber", "email");
		testBooking = new Booking("1", testUser, testPayment);
		testPayment2 = new Payment("2", "method2", "cardnumber2", "email2");
		testTicketType = new TicketType("child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);
		testShowing = new Showing();
		testTicket = new Ticket("1", testTicketType, testShowing);
		testTicket2 = new Ticket("2", testTicketType, testShowing);
		obm = new OfflineBookingManager();
	}
	
	//Once persist booking is fixed then test
	@Test
	public void findByBookingIdTest(){
		assertEquals(obm.findByBookingId("1"), testData.booking);
	}

}
