package qa_cinema.test_data;

import java.util.ArrayList;
import java.util.List;

import qa_cinema.data.booking.tickets.CustomerType;
import qa_cinema.data.booking.tickets.DaysOfWeek;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.booking.tickets.TicketType;
import qa_cinema.data.booking.tickets.TimesOfDay;
import qa_cinema.data.cinema.Seat;
import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Actor;
import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;

/*
@Startup
@Singleton
*/

public class TestData {

	public static TestData data = new TestData();

	private List<Ticket> ticketList;
	private List<Showing> showingList;
	private List<Film> filmList;
	private List<Actor> actorList;
	private List<User> userList;


	private TestData() { 
		ticketList = new ArrayList<Ticket>();

		showingList = new ArrayList<Showing>();

		filmList = new ArrayList<Film>();

		actorList = new ArrayList<Actor>();

		userList = new ArrayList<User>();
	}

	public TicketType ticket = new TicketType("child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);
	public Seat seat = new Seat("A1",1,"Fluffy");

	public Showing s1 = new Showing(1, 1, 1, "22/02/2017",  "2D", "Audio Described");
	public Ticket t1 = new Ticket("1", ticket, seat, s1);
	public Film f1 = new Film("The Human Centipede", 108, "We all know the movie. We all love it. Feeeeeeed him", 2014);
	public Actor a1 = new Actor("Tom", "Hanks");

	// Users u1 = new User("CONSTRUCTOR STUFF WITHOUT DATA TYPES"); no user stuff in the user class

	


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

	/*
	public void addUser(User u) {
		userList.add(u);
	}
	*/
	
	
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

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public static TestData getData() {
		return data;
	}

}
