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
	Role role;
	List<Role> rol;

	@Before
	public void setUp() {
		film = new Film("Lord of the Rings", 180, "Three Hobbits go on a journey", "2004");

		int x = 0;
		String[] genres = { "Adventure", "Action", "Fantasy" };
		String[] roles = {"Gandalf", "Bilbo", "Gimli"};
		gen = new ArrayList<Genre>();
		rol = new ArrayList<Role>();
		while (x < 3) {
			genre = new Genre(genres[x]);
			gen.add(genre);
			role = new Role(roles[x]);
			rol.add(role);
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

	@Test
	public void testGetGenres() {
		film.setGenres(gen);
		assertEquals("Adventure", film.getGenres().get(0).getGenre());
	}

	@Test
	public void testSetGenres() {
		film.setGenres(gen);
		assertEquals("Adventure", film.getGenres().get(0).getGenre());
	}

	@Test
	public void testGetRoles() {
		film.setRoles(rol);
		assertEquals("Gandalf", film.getRoles().get(0).getRole());
	}
	
	@Test
	public void testSetRoles() {
		film.setRoles(rol);
		assertEquals("Gandalf", film.getRoles().get(0).getRole());
	}

}
