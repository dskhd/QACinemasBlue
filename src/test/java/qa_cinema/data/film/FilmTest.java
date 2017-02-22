package qa_cinema.data.film;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FilmTest {

	Film film;

	@Before
	public void setUp() {
		film = new Film("TheTest", 120, "The film is about a test of films", "2009");
	}

	@Test
	public void testGetTitle() {

		assertEquals("TheTest", film.getTitle());
	}

	@Test
	public void testSetTitle() {

		String newTitle = "Hello";
		film.setTitle(newTitle);
		assertEquals("Hello", film.getTitle());
	}

	@Test
	public void testgetLengthMins() {

		assertEquals(120, film.getLengthMins());
	}

	@Test
	public void testSetLengthMins() {

		int newLength = 200;
		film.setLengthMins(newLength);
		assertEquals(200, film.getLengthMins());
	}

	@Test
	public void testgetDescription() {

		assertEquals("The film is about a test of films", film.getDescirption());
	}

	@Test
	public void testSetDescription() {

		String newDescription = "Sam Jarvis smells";
		film.setDescirption(newDescription);
		assertEquals("Sam Jarvis smells", film.getDescirption());
	}

	@Test
	public void testGetDate() {

		assertEquals("2009", film.getDate());
	}

	@Test
	public void testSetDate() {

		String newDate = "2010";
		film.setDate(newDate);
		assertEquals("2010", film.getDate());
	}
	
	////////////////////////////////////////////////////////////////////////
	
//	@Test
//	public Classification TestgetClassification() {
//		return classification;
//	}
//
//	@Test
//	public void setClassification(Classification classi) {
//		this.classification = classi;
//	}
//	
//	@Test
//	public List<Genre> getGenres() {
//		return genres;
//	}
//
//	@Test
//	public List<Role> getRoles() {
//		return roles;
//	}
	
	/////////////////////////////////////////////////////////////////////////

}
