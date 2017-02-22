/**
 * Created by Mark Lester
 */
package qacinema.service.managers.online;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import qacinema.data.users.User;
import qacinema.service.managers.UserManager;


@Stateless
public class UserManagerOnline implements UserManager{
	
	
	@PersistenceContext
    protected EntityManager em;
	
	
	private User user;
	
	
	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String getId(){
		return user.getEmail();
	}
	
	@Override
	public String getFirstname(){
		return user.getFirstName();
	}
	
	@Override
	public String getLastName(){
		return user.getLastName();
	}
	
	@Override
	public boolean getMailingList(){
		return user.getMailingList();
	}
	
	@Override
	public String getPassword(){
		return user.getPassword();
	}
	
	@Override
	public String getTelephone(){
		return user.getTelephone();
	}

	@Override
	public void updateLastName(String name) {
		user.setLastName(name);	
	}
	
	@Override
	public void updateMailingList(boolean onList) {
		user.setMailingList(onList);		
	}

	@Override
	public void updatePassword(String password) {
		user.setPassword(password);
	}

	@Override
	public void updateTelephone(String number) {
		user.setTelephone(number);
		
	}

	


	


	
	
	
	

}