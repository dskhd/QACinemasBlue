/**
 * Created by Matt Gordon
 */
package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.service.managers.AddressManager;
import qacinema.testdata.TestData;

public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testData;

	@Override
	public Address persistAdrress(Address address) {
		return null;
	}

	@Override
	public Address findAddressById(User user, String id) {
		for (Address address : user.getAddressList()) {
			if (address.getAddressID().equals(id)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Id");
	}

	@Override
	public Address findByLine1(User user, String line1) {
		for (Address address : user.getAddressList()) {
			if (address.getLine1().equals(line1)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Line1");
	}

	@Override
	public Address findByLine2(User user, String line2) {
		for (Address address : user.getAddressList()) {
			if (address.getLine2().equals(line2)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Line2");
	}

	@Override
	public Address findByTown(User user, String town) {
		for (Address address : user.getAddressList()) {
			if (address.getTown().equals(town)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Town");
	}

	@Override
	public Address findByCounty(User user, String county) {
		for (Address address : user.getAddressList()) {
			if (address.getCounty().equals(county)) {
				return address;
			}
		}
		throw new NoResultException("No Matching County");
	}

	@Override
	public Address findByPostcode(User user, String postcode) {
		for (Address address : user.getAddressList()) {
			if (address.getPostcode().equals(postcode)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Postcode");
	}

	@Override
	public void createAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub

	}

}
