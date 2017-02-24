/**
 * Created by Mark Lester
 */
package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

import qacinema.data.users.User;
import qacinema.service.managers.UserManager;

@Stateless
public class OnlineUserManager implements UserManager {
	
	@PersistenceContext
	private EntityManager em;

	
	
	
	@Override
	public User persistUser(User user) {
		em.persist(user);
		return null;
	}

	@Override
	public User findByEmail(String email) {
		em.find(User.class, email);
		return null;
	}

	@Override
	public List<User> findByFirstName(String firstName) {
		em.find(User.class, firstName);
		return null;
	}

	@Override
	public List<User> findByLastName(String lastName) {
		em.find(User.class, lastName);
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteUser(User user) {
		em.remove(user);
	}
}
