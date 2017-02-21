import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Adam
 * 
 * Will need sorting out with these tests when class names get amended
 * 
 * Singleton means that another instance of the newData can't be created due to being private... how to sort out?
 *
 */

public class TestDataTest {

	public  TestData newData = new TestData(); ////////////////////////////////// can't pull in due to singleton making it private?

	@Test
	public void testAddToTicketList() {
		Ticket t1 = new Ticket("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
		newData.addTicket(t1);
		assertEquals(1,newData.getTicketList().size());
	}
	
	@Test
	public void testAddToShowingList() {
		Showing s1 = new Showing("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
		newData.addShowing(s1);
		assertEquals(1,newData.getShowingList().length());
	}
	
	@Test
	public void testAddToFilmList() {
		Film f1 = new Film("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
		newData.addFilm(f1);
		assertEquals(1,newData.getFilmList().length());
	}

	
	@Test
	public void testAddToActorList() {
		Actor a1 = new Actor("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
		newData.addActor(a1);
		assertEquals(1,newData.getActorList().length());
	}

	@Test
	public void testAddToUserList() {
		Users u1 = new User("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
		newData.addUser(u1);
		assertEquals(1,newData.getUserList().length());
	}


}
