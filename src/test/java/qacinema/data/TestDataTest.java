package qacinema.data;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;
import javax.inject.Inject;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import qacinema.data.booking.Booking;
import qacinema.data.booking.Payment;
import qacinema.data.booking.tickets.CustomerType;
import qacinema.data.booking.tickets.DaysOfWeek;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.booking.tickets.TicketType;
import qacinema.data.booking.tickets.TimesOfDay;
import qacinema.data.cinema.Screen;
import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.film.Role;
import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.testdata.TestData;


/**
 * 
 * @author Adam
 * 
 * Will need sorting out with these tests when class names get amended
 *
 */

public class TestDataTest {

	public TestData newData = mock(TestData.class);
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void testAddToTicketList() {
		System.out.println("Enter: testAddToTicketList");
		//newData.addTicket(newData.ticket); // add to ticketList by inputting constructor relevant info
		
		when(newData.addTicket(newData.ticket)).thenReturn(newData.getTicketMap().size());
		
		
		//assertThat(newData.getTicketMap().size(), is(1));
		
		assertEquals(1, newData.getTicketMap().size());
		
		
		
	}
	/*
	@Test
	public void testAddToShowingList() {
		System.out.println("Enter: testAddToShowingList");
		newData.addShowing(showing);
		assertEquals(1,newData.getShowingMap().size());
	}
	
	@Test
	public void testAddToFilmList() {
		System.out.println("Enter: testAddToFilmList");
		newData.addFilm(film);
		assertEquals(1,newData.getFilmMap().size());
	}

	
	@Test
	public void testAddToActorList() {
		System.out.println("Enter: testAddToActorList");
		newData.addActor(actor);
		assertEquals(1,newData.getActorMap().size());
	}

	@Test
	public void testAddToUserList() {
		System.out.println("Enter: testAddToUserList");
		newData.addUser(user);
		assertEquals(1,newData.getUserMap().size());
	}
*/

}
