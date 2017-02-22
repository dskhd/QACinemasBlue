/**
 * Created by Matt Gordon
 */
package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.users.Address;

public interface AddressManager {

	public Address persistAdrress(Address address);

	public Address findAddressById(int id);

	public Address findByLine1(String line1);

	public Address findByLine2(String line2);

	public Address findByTown(String town);

	public Address findByCounty(String county);

	public Address findByPostcode(String postcode);

	public void createAddress(Address address);

	public void updateAddress(Address address);

	public void deleteAddress(Address address);
}
