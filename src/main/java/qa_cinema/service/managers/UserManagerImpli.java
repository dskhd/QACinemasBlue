package qa_cinema.service.managers;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import qa_cinema.data.users.User;

public class UserManagerImpli implements UserManager{
	
	
	@Inject
    protected EntityManager em;
	private User user;
	
	public UserManagerImpli(int id) {
		super();
		user = em.find(User.class, id);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMailingList(boolean onList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTelephone(String number) {
		// TODO Auto-generated method stub
		
	}


	


	
	
	
	

}
