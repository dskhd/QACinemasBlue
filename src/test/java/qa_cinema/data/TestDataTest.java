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
		newData.ticketList.add(); // add to ticketList by inputting constructor relevant info
		assertEquals(1,newData.getTicketList().length());
	}
	
	@Test
	public void testAddToShowingList() {
		newData.showingList.add();
		assertEquals(1,newData.getShowingList().length());
	}
	
	@Test
	public void testAddToFilmList() {
		newData.filmList.add();
		assertEquals(1,newData.getFilmList().length());
	}

	
	@Test
	public void testAddToActorList() {
		newData.actorList.add();
		assertEquals(1,newData.getActorList().length());
	}

	@Test
	public void testAddToUserList() {
		newData.userList.add();
		assertEquals(1,newData.getUserList().length());
	}


}
