package BS.QACinema.dataLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BS.QACinema.dataLayer.booking.tickets.CustomerType;
import BS.QACinema.dataLayer.booking.tickets.DaysOfWeek;
import BS.QACinema.dataLayer.booking.tickets.TicketType;
import BS.QACinema.dataLayer.booking.tickets.TimesOfDay;

public class TicketTypeTest {
	
	TicketType ticket;
	
	@Before
	public void setup(){
		ticket = new TicketType("child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);
	}

	@Test
	public void testGetType(){
		assertEquals("child", ticket.getType());
	}
	
	@Test
	public void testSetType() {
		ticket.setType("adult");
		assertEquals("adult", ticket.getType());
	}
	
	
	@Test
	public void testGetPrice(){
		assertEquals(6.99f, ticket.getPrice(), 0.001);
	}
	
	@Test
	public void testSetPrice(){
		ticket.setPrice(8.99f);
		assertEquals(8.99f, ticket.getPrice(), 0.001);
	}
	
	@Test
	public void testGetDaysOfWeek(){
		assertEquals(DaysOfWeek.ALL, ticket.getAvailableDays());
	}
	
	@Test
	public void testSetDaysOfWeek(){
		ticket.setAvailableDays(DaysOfWeek.WEEKDAYS);
		assertEquals(DaysOfWeek.WEEKDAYS, ticket.getAvailableDays());
	}
	
	@Test
	public void testGetTimesOfDay(){
		assertEquals(TimesOfDay.ALL_DAY, ticket.getAvailableTimes());
	}
	
	@Test
	public void testSetTimeOfDay(){
		ticket.setAvailableTimes(TimesOfDay.MORNING);
		assertEquals(TimesOfDay.MORNING, ticket.getAvailableTimes());
	}
	
	@Test
	public void testGetAvailableTo(){
		assertEquals(CustomerType.CHILD, ticket.getAvailableTo());
	}
	
	@Test
	public void testSetAvailableTo(){
		ticket.setAvailableTo(CustomerType.ALL);
		assertEquals(CustomerType.ALL, ticket.getAvailableTo());
	}
	

}
