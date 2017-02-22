package qa_cinema.data.user;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;
import qa_cinema.data.users.UserRating;



public class UserRatingTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private UserRating userRating = new UserRating();
	
	private String rating;
	private String comment;
	private User reviewer;
	private List<Film> films;
	
	
	@Test
	public void myTest() {
		assertEquals(1,1);
	}
	
	
	
}
