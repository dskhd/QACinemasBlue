package qa_cinema.data.film;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoleTest {
	
	Role rol;
	
	@Before
	public void setUp() {
		rol = new Role("MrsTest");
	}
	
	@Test
	public void testGetRole(){
		
		assertEquals("MrsTest", rol.getRole());
	}
	
	@Test
	public void testSetRole(){
		
		String newRole = "MrTest";
		rol.setRole(newRole);
		assertEquals("MrTest", rol.getRole());
	}

}
