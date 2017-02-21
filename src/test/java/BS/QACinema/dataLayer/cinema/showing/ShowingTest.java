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
		assertEquals("IMAX", exp);
	}
	
	@Test
	public void timeTest(){
		Showing show = new Showing();
		
		show.setDateTime("10022017164500");
		String time = show.getDateTime();
		assertEquals("10022017164500", time);
	}
	
}
