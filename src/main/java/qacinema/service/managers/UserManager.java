/**
 * Created by Mark Lester
 * Editor Matt Gordon
 */
package qacinema.service.managers;

import java.util.List;

import qacinema.data.users.User;

public interface UserManager {

	public User persistUser(User user);
	public User findByEmail(String email); // User Id
	public List<User> findUsersByFirstName(String firstName);
	public List<User> findUsersByLastName(String lastName);
	public List<User> findAllUsers();
	public void deleteUser(User user);
}
