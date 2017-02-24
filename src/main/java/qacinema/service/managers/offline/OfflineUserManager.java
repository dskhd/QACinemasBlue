/**
 * Created by Mark Lester
 * Editor Matt Gordon
 */
package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import qacinema.annotations.Loggable;
import qacinema.data.users.User;
import qacinema.service.managers.UserManager;
import qacinema.testdata.TestData;

@Stateless
@Loggable
@Default
public class OfflineUserManager implements UserManager {

	@Inject
	private TestData testData;

	@Override
	public User persistUser(User user) {
		return null;
	}

	@Override
	public User findByEmail(String email) throws NoResultException {
		for (User user : testData.getUserMap().values()) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}

		throw new NoResultException("No Matching Email");
	}

	@Override
	public List<User> findByFirstName(String firstName) {
		List<User> userList = new ArrayList<>();
		for (User user : testData.getUserMap().values()) {
			if (user.getFirstName().equals(firstName)) {
				userList.add(user);
				return userList;
			}
		}

		throw new NoResultException("No Matching First Name");
	}

	@Override
	public List<User> findByLastName(String lastName) {
		List<User> userList = new ArrayList<>();
		for (User user : testData.getUserMap().values()) {
			if (user.getLastName().equals(lastName)) {
				userList.add(user);
				return userList;
			}
		}

		throw new NoResultException("No Matching Last Name");
	}

	@Override
	public List<User> findAllUsers() {
		List<User> userList = new ArrayList<>();
		userList.addAll(testData.getUserMap().values());
		if (!userList.isEmpty()) {
			return userList;
		}

		throw new NoResultException("No Users found");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
