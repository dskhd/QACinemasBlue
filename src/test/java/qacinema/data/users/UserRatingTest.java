/**
 * Created by Mark Lester
 */
package qacinema.data.users;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.users.UserRating;



public class UserRatingTest {



	@Before
	public void setUp() throws Exception {
		userRating.setComment("hello");
		//userRating.setFilms(films);
		//userRating.setReviewer(User);
		userRating.setRating(1);
		userRating.setRatingId(1);
	}


	private UserRating userRating = new UserRating();
	
	
	
	@Test
	public void getRatingId() {
		assertEquals(1, userRating.getRatingId());
	}
	
	
	@Test
	public void getComment() {
		;
		assertEquals("hello",userRating.getComment());
	}
	
	//@Test
	//public void getFilms() {
	//	userRating.getFilms();
	//	assertEquals(1,1);
	//}
	
	@Test
	public void getRating() {
		assertEquals(1,userRating.getRating());
	}
	
	//@Test
	//public void getReviewer() {
	//	userRating.getReviewer();
	//	assertEquals(1,1);
	//}
	
	
	
}
