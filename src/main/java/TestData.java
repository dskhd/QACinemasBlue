import java.util.ArrayList;
import java.util.List;

/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class TestData {

	public static TestData data = new TestData();

	private List<Ticket> ticketList;
	private List<Showing> showingList;
	private List<Film> filmList;
	private List<Actor> actorList;
	private List<Users> userList;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	private TestData() { 
		ticketList = new ArrayList<Ticket>();

		showingList = new ArrayList<Showing>();

		filmList = new ArrayList<Film>();

		actorList = new ArrayList<Actor>();

		userList = new ArrayList<Users>();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	Ticket t1 = new Ticket("CONSTRUCTOR STUFF WITHOUT DATA TYPES");

	Showing s1 = new Showing("CONSTRUCTOR STUFF WITHOUT DATA TYPES");

	Film f1 = new Film("CONSTRUCTOR STUFF WITHOUT DATA TYPES");

	Actor a1 = new Actor("CONSTRUCTOR STUFF WITHOUT DATA TYPES");

	Users u1 = new User("CONSTRUCTOR STUFF WITHOUT DATA TYPES");
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	ticketList.addTicket(t1);
	showingList.addShowing(s1);
	filmList.addFilm(f1);
	actorList.addActor(a1);
	userList.addUser(u1);
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	public void addTicket(Ticket t) {
		ticketList.add(t);
	}
	
	public void addShowing(Showing s) {
		showingList.add(s);
	}

	public void addFilm(Film f) {
		filmList.add(f);
	}

	public void addActor(Actor a) {
		actorList.add(a);
	}

	public void addUser(User u) {
		userList.add(u);
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
