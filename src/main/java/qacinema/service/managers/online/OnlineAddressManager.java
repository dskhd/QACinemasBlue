/**
 * Created by Matt Gordon
 */
package qacinema.service.managers.online;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import qacinema.annotations.Loggable;
import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.service.managers.AddressManager;

@Alternative
@Stateless
@Loggable
public class OnlineAddressManager implements AddressManager {

	@Inject
	protected EntityManager em;

	@Override
	public Address persistAdrress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByLine1(String line1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByLine2(String line2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByTown(String town) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByCounty(String county) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByPostcode(String postcode) {
		// TODO Auto-generated method stub
		return null;
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
