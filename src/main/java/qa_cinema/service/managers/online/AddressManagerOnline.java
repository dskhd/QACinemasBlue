/**
 * Created by Matt Gordon
 */
package qa_cinema.service.managers.online;

import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import qa_cinema.data.users.Address;
import qa_cinema.service.managers.AddressManager;

@Alternative
public class AddressManagerOnline implements AddressManager {

	@Inject
	protected EntityManager em;

	@Override
	public Address persistAdrress() {
		return null;
	}

	@Override
	public Address findAddressById(String id) {
		return null;
	}

	@Override
	public List<Address> findByPostcode(String postcode) {
		return null;
	}

	@Override
	public void createAddress(Address address) {

	}

	@Override
	public void updateAddress(Address address) {

	}

	@Override
	public void deleteAddress(Address address) {

	}

}
