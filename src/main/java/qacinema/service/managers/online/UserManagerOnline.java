/**
 * Created by Mark Lester
 */
package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import qacinema.data.users.User;
import qacinema.service.managers.UserManager;

@Stateless
public class UserManagerOnline implements UserManager {

	@Override
	public User persistUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
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
