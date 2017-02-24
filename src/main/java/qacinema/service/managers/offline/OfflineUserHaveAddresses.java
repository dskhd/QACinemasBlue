package qacinema.service.managers.offline;

import javax.inject.Inject;

import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.data.users.UserHaveAddresses;
import qacinema.service.managers.UserHaveAddressesManager;
import qacinema.testdata.TestData;

public class OfflineUserHaveAddresses implements UserHaveAddressesManager {

	@Inject private TestData testData;
	
	@Override
	public UserHaveAddresses persistUserHaveAddresses(UserHaveAddresses userHaveAddresses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByType(User user, String type) {
		for (UserHaveAddresses userHaveAddresses : user.getUserHasAddresses()) {
			for (Address address : testData.getAddressMap().values()) {
				if (userHaveAddresses.getAddressType().equals(type)) {
					return address;
				}
			}
		}
		return null;
	}

	@Override
	public void createUserHaveAddresses(UserHaveAddresses userHaveAddresses) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserHaveAddresses(UserHaveAddresses userHaveAddresses) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserHaveAddresses(UserHaveAddresses userHaveAddresses) {
		// TODO Auto-generated method stub

	}

}
