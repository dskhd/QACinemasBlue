/**
 * Created by Mark Lester
 */
package qa_cinema.service.managers;

import qa_cinema.data.users.User;

public interface UserManager {

	public User getUser();
	public void setUser(User user);
	
	public String getId();
	public String getFirstname();
	public String getLastName();
	public boolean getMailingList();
	public String getPassword();
	public String getTelephone();
	
	
	public void updateLastName(String name);
	public void updateMailingList(boolean onList);
	public void updatePassword(String password);
	public void updateTelephone(String number);
	
	
}
