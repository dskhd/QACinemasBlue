package qacinema.service.managers;

import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.data.users.UserHaveAddresses;

public interface UserHaveAddressesManager {
	public UserHaveAddresses persistUserHaveAddresses(UserHaveAddresses userHaveAddresses);
	public Address findAddressByType(User user, String type);
	public void createUserHaveAddresses(UserHaveAddresses userHaveAddresses);
	public void updateUserHaveAddresses(UserHaveAddresses userHaveAddresses);
	public void deleteUserHaveAddresses(UserHaveAddresses userHaveAddresses);
}
