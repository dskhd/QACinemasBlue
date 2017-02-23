package qacinema.data.film;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FilmTest {

	Film film;
	Genre genre;
	List<Genre> gen;

	@Before
	public void setUp() {
		film = new Film("Lord of the Rings", 180, "Three Hobbits go on a journey", "2004");
		
		int x = 0;
		String[] genres = {"Adventure", "Action", "Fantasy"};
		gen = new ArrayList<Genre>();
		while(x <3){
			genre = new Genre(genres[x]);
			gen.add(genre);
			x++;
		}
		
	}

	@Test
	public void testGetTitle() {

		assertEquals("Lord of the Rings", film.getTitle());
	}

	@Test
	public void testSetTitle() {

		String newTitle = "Hello";
		film.setTitle(newTitle);
		assertEquals("Hello", film.getTitle());
	}

	@Test
	public void testgetLengthMins() {

		assertEquals(180, film.getLengthMins());
	}

	@Test
	public void testSetLengthMins() {

		int newLength = 200;
		film.setLengthMins(newLength);
		assertEquals(200, film.getLengthMins());
	}

	@Test
	public void testgetDescription() {

		assertEquals("Three Hobbits go on a journey", film.getDescription());
	}

	@Test
	public void testSetDescription() {

		String newDescription = "Sam Jarvis smells";
		film.setDescription(newDescription);
		assertEquals("Sam Jarvis smells", film.getDescription());
	}

	@Test
	public void testGetDate() {

		assertEquals("2004", film.getDate());
	}

	@Test
	public void testSetDate() {

		String newDate = "2010";
		film.setDate(newDate);
		assertEquals("2010", film.getDate());
	}
	
	//TODO need to get this to display String. Doesn't work
	@Test
	public void testGetGenres() {
		film.setGenres(gen);
		System.out.println(film.getGenres().get(0).toString());
		assertEquals("Adventure" , film.getGenres().get(0).toString());
	}
	
//	//TODO need to get this to display String.
//	@Test
//	public void testSetGenres() {
//		film.setGenres(gen);
//		System.out.println(film.getGenres().get(1).toString());
//		assertEquals("qacinema.data.film.Genre@6d5380c2", film.getGenres().get(1).toString());
//	}
	
	
	
	
	



}
