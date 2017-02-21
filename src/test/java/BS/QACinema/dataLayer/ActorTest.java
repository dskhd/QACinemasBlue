package BS.QACinema.dataLayer;

import BS.QACinema.dataLayer.film.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActorTest {

	Actor act;

	@Before
	public void setUp() {
		act = new Actor("Samuel L", "Jackson");
	}

	@Test
	public void testGetFirstName() {

		assertEquals("Samuel L", act.getFirstName());
	}

	@Test
	public void testSetFirstName() {

		String newFirstName = "Tom";
		act.setFirstName(newFirstName);
		assertEquals("Tom", act.getFirstName());
	}

	@Test
	public void testGetLastName() {

		assertEquals("Jackson", act.getLastName());
	}
	
	@Test
	public void testSetLastName() {

		String newLastName = "Hanks";
		act.setLastName(newLastName);
		assertEquals("Hanks", act.getLastName());
	}

}
