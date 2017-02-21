import java.util.ArrayList;
import java.util.List;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class TestData {
	
	public static TestData data = new TestData();
	
	public List<Ticket> ticketList;
	public List<Showing> showingList;
	public List<Film> filmList;
	public List<Actor> actorList;
	public List<Users> userList;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public TestData() { // made default so can be accessed by TestDataTest
		 ticketList = new ArrayList<Ticket>();
		
			ticketList.add(); //add TICKET depending on constructor
		
		showingList = new ArrayList<Showing>();
		
			showingList.add(); //add SHOWING depending on constructor

		filmList = new ArrayList<Film>();
		
			filmList.add(); //add FILM depending on constructor
		
		actorList = new ArrayList<Actor>();
		
			actorList.add(); //add ACTOR depending on constructor
		
		userList = new ArrayList<Users>();
		
			userList.add(); //add USER depending on constructor
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	public List<Showing> getShowingList() {
		return showingList;
	}

	public void setShowingList(List<Showing> showingList) {
		this.showingList = showingList;
	}

	public List<Film> getFilmList() {
		return filmList;
	}

	public void setFilmList(List<Film> filmList) {
		this.filmList = filmList;
	}

	public List<Actor> getActorList() {
		return actorList;
	}

	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}

	public List<Users> getUserList() {
		return userList;
	}

	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}

	public static TestDate getData() {
		return data;
	}
	
	

}
