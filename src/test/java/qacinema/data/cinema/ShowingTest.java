package qacinema.data.cinema;

import static org.junit.Assert.*;
import org.junit.Test;

import qacinema.data.film.Film;


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
		
		show.setScreen(new Screen("4", 'A', 12, ""));
		Screen screen = show.getScreen();
		assertEquals(screen, screen);
	}
	
	@Test
	public void testFilm(){
		Showing show = new Showing();
		Film film = new Film();
		show.setFilm(film);
		assertEquals(film, show.getFilm());
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
		
		show.setShowingID("3");
		String showID = show.getShowingID();
		assertEquals(showID, "3");
		
	}

	
}
