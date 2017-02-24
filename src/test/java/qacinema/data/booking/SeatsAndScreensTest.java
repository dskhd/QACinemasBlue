package qacinema.data.booking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.cinema.Screen;
import qacinema.data.cinema.Seat;

public class SeatsAndScreensTest {

	private Screen screen;
	private Seat seat;
	
	@Before
	public void setUp(){
		screen = new Screen("1", 'n', 10, "Standard");
		seat = new Seat("A43", "Regular");
	}

	
	@Test
	public void testScreenType(){ 
		assertEquals("Standard", screen.getScreenType());
	}
	@Test
	public void testSeatType() {
		assertEquals("Regular", seat.getType());
	}
	
	@Test
	public void testSeatNumber() {
		assertEquals("A43", seat.getSeat());
	}
}
