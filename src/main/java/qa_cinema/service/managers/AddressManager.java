/**
 * Created by Matt Gordon
 */
package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.users.Address;

public interface AddressManager {

	public Address persistAdrress();

	public Address findById(String id);

	public List<Address> findByPostcode(String postcode);

	public List<Address> getAddressList();

	public void createAddress(Address address);

	public void updateAddress(Address address);

	public void deleteAddress(Address address);
}
