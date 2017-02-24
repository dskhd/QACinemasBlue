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
	public List<User> findByFirstName(String firstName);
	public List<User> findByLastName(String lastName);
	public List<User> findAllUsers();
	public void deleteUser(User user);
}
