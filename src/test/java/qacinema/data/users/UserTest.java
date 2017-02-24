/**
 * Created by Mark Lester
 */
package qacinema.data.users;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import qacinema.data.users.User;

public class UserTest {

	@Before
	public void setUp() {
		user.setAccountType("gold");
		user.setEmail("user@mail");
		user.setFirstName("name1");
		user.setLastName("name2");
		user.setMailingList(false);
		user.setPassword("password1");
		user.setTelephone("01246123456");

		Address address = new Address();
		address.setAddressID("1");
		address.setCounty("county");
		address.setLine1("line1");
		address.setLine2("line2");
		address.setPostcode("postcode");
		address.setTown("town");
		addressList.add(address);
		user.setAddressList(addressList);
	}

	User user = new User();
	List<Address> addressList = new ArrayList<>();

	@Test
	public void testGetEmail() {
		assertEquals("user@mail", user.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("password1", user.getPassword());
	}

	@Test
	public void testGetAccountType() {
		assertEquals("gold", user.getAccountType());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("name1", user.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("name2", user.getLastName());
	}

	@Test
	public void testGetTelephoneNumber() {
		assertEquals("01246123456", user.getTelephone());
	}

	@Test
	public void testGetMailingList() {
		assertEquals(false, user.getMailingList());
	}

	@Test
	public void testGetAddress() {
		boolean addressFound = false;
		for (Address address : user.getAddressList()) {
			if (address.getAddressID().equals("1")) {
				addressFound = true;
			}
		}
		assertTrue(addressFound);
	}

}
