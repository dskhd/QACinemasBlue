/*//
 * Created by Martyn Green
*/


package Datalayer.Booking.BooksSteats;

import org.junit.Test;

import junit.framework.*;
import main.java.Datalayer.Booking.BooksSeats.Screen;
import main.java.Datalayer.Booking.BooksSeats.Seat;

public class TestData {
	@Test
	private void testScreenCapacity() {
		Screen testScreen = new Screen(1, 1066, "Standad");
		int x = testScreen.getCapacity();
		Assert.assertEquals(x, 1066);
	}
	@Test
	private void testScreenType() {
		Screen testScreen = new Screen(1, 1066, "Standad");
		String x = testScreen.getScreenType();
		Assert.assertEquals(x, "Standard");
	}
	@Test
	private void testSeatType() {
		Seat testSeat = new Seat("BB", 1, "Regular");
		String x = testSeat.getType();
		Assert.assertEquals(x, "Regular");
	}
	@Test
	private void testSeatNumber() {
		Seat testSeat = new Seat("BB", 1, "Regular");
		String x = testSeat.getSeat();
		Assert.assertEquals(x, "BB");
	}
	
}


