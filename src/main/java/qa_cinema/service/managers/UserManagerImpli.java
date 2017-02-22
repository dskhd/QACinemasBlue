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


	public String getId(){
		return user.getEmail();
	}

	public String getFirstname(){
		return user.getFirstName();
	}
	
	public String getLastName(){
		return user.getLastName();
	}
	
	public boolean getMailingList(){
		return user.getMailingList();
	}
	
	public String getPassword(){
		return user.getPassword();
	}
	
	public String getTelephone(){
		return user.getTelephone();
	}
	
	
	

}
