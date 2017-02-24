package qacinema.data.film;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoleTest {
	
	Role rol;
	Actor act;
	Film fil;
	
	@Before
	public void setUp() {
		rol = new Role("Ned Stark");
		act = new Actor("Sean", "Bean");
		fil = new Film();
	}
	
	@Test
	public void testGetRole(){
		
		assertEquals("Ned Stark", rol.getRole());
	}
	
	@Test
	public void testSetRole(){
		
		String newRole = "MrTest";
		rol.setRole(newRole);
		assertEquals("MrTest", rol.getRole());
	}
	
	@Test
	public void testGetActor() {
		rol.setActor(act);
		assertEquals("SeanBean", rol.getActor().getFirstName() + rol.getActor().getLastName());
	}

	@Test
	public void testSetActor() {
		rol.setActor(act);
		assertEquals("Sean", rol.getActor().getFirstName());
	}
	
	@Test
	public void testGetFilmId() {
		fil.setFilmId("f001");
		rol.setFilmId(fil);
		assertEquals("f001", rol.getFilmId().getFilmId());
	}
	
	@Test
	public void testSetFilmId() {
		fil.setFilmId("f001");
		rol.setFilmId(fil);
		assertEquals("f001", rol.getFilmId().getFilmId());
	}

}
