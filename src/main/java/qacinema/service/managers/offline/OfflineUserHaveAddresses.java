package qacinema.service.managers.offline;

import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.data.users.UserHaveAddresses;
import qacinema.service.managers.UserHaveAddressesManager;

public class OfflineUserHaveAddresses implements UserHaveAddressesManager {

	@Override
	public UserHaveAddresses persistUserHaveAddresses(UserHaveAddresses userHaveAddresses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findAddressByType(User user, String type) {
		for (UserHaveAddresses userHaveAddresses : testData.getUserHaveAddressesMap().values()) {
			if (userHaveAddresses.getUserEmail().equals(user.getEmail())) {
				for (Address address : user.getAddressList()) {
					if (userHaveAddresses.getAddressType().equals(type)) {
						return address;
					}
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
