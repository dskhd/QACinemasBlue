package qa_cinema.data;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import qa_cinema.test_data.TestData;

/**
 * 
 * @author Adam
 * 
 * Will need sorting out with these tests when class names get amended
 *
 */

public class TestDataTest {

	public TestData newData = TestData.getData();

	@Test
	public void testAddToTicketList() {
		newData.getTicketList().add(); // add to ticketList by inputting constructor relevant info
		assertEquals(1,newData.getTicketList().size());
	}
	
	@Test
	public void testAddToShowingList() {
		newData.getShowingList().add()
		assertEquals(1,newData.getShowingList().size());
	}
	
	@Test
	public void testAddToFilmList() {
		newData.getFilmList().add()
		assertEquals(1,newData.getFilmList().size());
	}

	
	@Test
	public void testAddToActorList() {
		newData.getActorList().add();
		assertEquals(1,newData.getActorList().size());
	}

	@Test
	public void testAddToUserList() {
		newData.getUserList().add();
		assertEquals(1,newData.getUserList().size());
	}


}
