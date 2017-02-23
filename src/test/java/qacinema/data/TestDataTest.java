package qacinema.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static org.junit.Assert.*;
import javax.inject.Inject;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

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

import static org.mockito.Mockito.*;
import static moxie.hamcrest.IsMapWithSize.mapWithSize;;
/**
 * 
 * @author Adam
 * 
 * Will need sorting out with these tests when class names get amended
 *
 */

public class TestDataTest {
	@Mock
	public TestData newData = mock(TestData.class);
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
	
	@Test
	public void testAddToTicketList() {
		/* EXAMPLE THAT WORKS
		 Map<String, Integer> map = new HashMap<>();
		    map.put("key", 1);
		    assertThat(map, mapWithSize(1));
		  */ 
		
		
		newData.addTicket(newData.ticket);
		
		assertThat(newData.getTicketMap(), mapWithSize(1));
		
		
		
		
		/*
		System.out.println("before for1");
		for (Integer key : newData.getTicketMap().keySet()) {
		    System.out.println(key + " " + newData.getTicketMap().get(key));
		}
		System.out.println("before for2");
		for (Entry<Integer, Ticket> entry : newData.getTicketMap().entrySet()) {
		    String key = entry.getKey().toString();
		    Ticket value = entry.getValue();
		    System.out.println("key, " + key + " value " + value);
		}
		System.out.println(newData.getTicketMap().toString());
		*/
		
		
				
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
