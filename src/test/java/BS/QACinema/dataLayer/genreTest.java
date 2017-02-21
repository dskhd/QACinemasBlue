package BS.QACinema.dataLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BS.QACinema.dataLayer.film.Genre;

public class genreTest {

	Genre gen;
	
	
	@Before
	public void setUp() throws Exception {
		gen = new Genre("Horror");
		
	}

	@Test
	public void testGenreConstructor() {
		assertEquals("Horror", gen.getGenre());
	}
	
	@Test
	public void testSetGenre() {
		gen.setGenre("Comedy");
		assertEquals("Comedy", gen.getGenre());
	}
	
	@Test
	public void testGetGenreId() {
		gen.setGenre("Comedy");
		assertNull(gen.getId());
	}
	
	

}
