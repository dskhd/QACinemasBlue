package qacinema.data.film;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GenreTest {

	Genre gen;
	
	
	@Before
	public void setUp() {
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
