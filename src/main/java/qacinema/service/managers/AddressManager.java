/**
 * Created by Matt Gordon
 */
package qacinema.service.managers;

import qacinema.data.users.Address;
import qacinema.data.users.User;

public interface AddressManager {

	public Address persistAdrress(Address address);
	public Address findAddressById(User user, String id);
	public Address findByLine1(User user, String line1);
	public Address findByLine2(User user, String line2);
	public Address findByTown(User user, String town);
	public Address findByCounty(User user, String county);
	public Address findByPostcode(User user, String postcode);
	public void createAddress(Address address);
	public void updateAddress(Address address);
	public void deleteAddress(Address address);
}
