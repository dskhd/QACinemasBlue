package qacinema.data.booking;

import static org.junit.Assert.*;

import org.junit.Test;

import qacinema.data.cinema.Screen;
import qacinema.data.cinema.Seat;

public class SeatsAndScreensTest {

	@Test
	private void testScreenCapacity() {
		Screen testScreen = new Screen(1, 1066, "Standad");
		int x = testScreen.getCapacity();
		assertEquals(x, 1066);
	}
	@Test
	private void testScreenType() {
		Screen testScreen = new Screen(1, 1066, "Standad");
		String x = testScreen.getScreenType();
		assertEquals(x, "Standard");
	}
	@Test
	private void testSeatType() {
		Seat testSeat = new Seat("BB", 1, "Regular");
		String x = testSeat.getType();
		assertEquals(x, "Regular");
	}
	
	@Test
	private void testSeatNumber() {
		Seat testSeat = new Seat("BB", 1, "Regular");
		String x = testSeat.getSeat();
		assertEquals(x, "BB");
	}
}
