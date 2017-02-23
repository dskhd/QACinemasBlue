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

import qacinema.data.users.Address;



public class AddressTest {


	@Before
	public void setUp() {
		address.setAddressID(1);
		address.setCounty("county");
		address.setLine1("line1");
		address.setLine2("line2");
		address.setPostcode("postcode");
		address.setTown("town");
	}

	
	private Address address = new Address();
		
	
	
	@Test
	public void getAddressId() {
		assertEquals(1,address.getAddressID());
	}
	
	@Test
	public void getLine1() {
		assertEquals("line1",address.getLine1());
	}
	
	@Test
	public void getLine2() {
		assertEquals("line2",address.getLine2());
	}
	
	@Test
	public void getTown() {
		assertEquals("town",address.getTown());
	}
	
	@Test
	public void getCounty() {
		assertEquals("county",address.getCounty());
	}
	
	@Test
	public void getPostcode() {
		assertEquals("postcode",address.getPostcode());
	}
	

}
