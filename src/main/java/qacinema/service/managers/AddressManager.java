/**
 * Created by Matt Gordon
 */
package qacinema.service.managers;

import qacinema.data.users.Address;

public interface AddressManager {

	public Address persistAdrress(Address address);
	public Address findAddressById(String id);
	public Address findByLine1(String line1);
	public Address findByLine2(String line2);
	public Address findByTown(String town);
	public Address findByCounty(String county);
	public Address findByPostcode(String postcode);
	public void createAddress(Address address);
	public void updateAddress(Address address);
	public void deleteAddress(Address address);
}
