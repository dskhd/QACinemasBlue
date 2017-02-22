/**
 * Created by Mark Lester
 */
package qa_cinema.service.managers.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.users.User;
import qa_cinema.service.managers.UserManager;



@Stateless @Loggable @Default
public class UserManagerOffline implements UserManager{

	
	private User user;
	
	public UserManagerOffline(User user) {
		super();
		this.user = user;
	}
	
	
	
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
