package qa_cinema.managers;

public interface UserManager {

	
	
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
