/**
 * Created by Mark Lester
 */
package qacinema.data.users;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import qacinema.data.users.User;


public class UserTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user.setAccountType("gold");
		user.setEmail("user@mail");
		user.setFirstName("name1");
		user.setLastName("name2");
		user.setMailingList(false);
		user.setPassword("password1");
		user.setTelephone("01246123456");
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	User user = new User();
	
	
	@Test
	public void getEmail() {
		assertEquals("user@mail",user.getEmail());
	}
	
	
	@Test
	public void getPassword() {
		assertEquals("password1", user.getPassword());
	}
	
	@Test
	public void getAccountType() {
		assertEquals("gold",user.getAccountType());
	}
	
	@Test
	public void getFirstName() {
		assertEquals("name1",user.getFirstName());
	}
	
	
	@Test
	public void getLastName() {
		assertEquals("name2",user.getLastName());
	}
	
	@Test
	public void getTelephoneNumber() {
		assertEquals("01246123456",user.getTelephone());
	}
	
	
	@Test
	public void getMailingList() {
		assertEquals(false, user.getMailingList());
	}
	
	
	
	
	
	

}
