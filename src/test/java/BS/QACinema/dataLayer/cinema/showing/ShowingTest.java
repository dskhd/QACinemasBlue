package BS.QACinema.dataLayer.cinema.showing;

import static org.junit.Assert.*;
import org.junit.Test;
import src.main.java.BS.QACinema.dataLayer.cinema.Showing;

public class ShowingTest {

	@Test
	public void experienceTest() {
		Showing show = new Showing();
		
		show.setExperience("IMAX");
		String exp = show.getExperience();
		assertEquals(exp,"IMAX" );
	}
	
	@Test
	public void timeTest(){
		Showing show = new Showing();
		
		show.setDateTime("10022017164500");
		String time = show.getDateTime();
		assertEquals("10022017164500", time);
	}
	
	@Test
	public void testScreen(){
		Showing show = new Showing();
		
		show.setScreen(4);
		int screen = show.getScreen();
		assertEquals(screen, 4);
	}
	
	@Test
	public void testFilm(){
		Showing show = new Showing();
		
		show.setFilm(2);
		int film = show.getFilm();
		assertEquals(film, 2);
	}
	
	@Test
	public void testAccessability(){
		Showing show = new Showing();
		
		show.setAccessability("Subtitled");
		String access = show.getAccessability();
		assertEquals(access,"Subtitled");
	}
	
	@Test 
	public void testShowingID(){
		Showing show = new Showing();
		
		show.setShowingID(3);
		int showID = show.getShowingID();
		assertEquals(showID, 3);
		
	}
	
	@Test
	public void testConsutructor(){
		Showing show = new Showing(3, 2, 4, "10022017164500", "IMAX", "Subtitled");
		int showID = show.getShowingID();
		assertEquals(showID, 3);
		
		String access = show.getAccessability();
		assertEquals(access,"Subtitled");
		
		int film = show.getFilm();
		assertEquals(film, 2);
		
		int screen = show.getScreen();
		assertEquals(screen, 4);
		
		String time = show.getDateTime();
		assertEquals("10022017164500", time);
		
		String exp = show.getExperience();
		assertEquals(exp,"IMAX" );
		
		
	}
	
}
