package qacinema.testdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Default;

import qacinema.data.booking.Booking;
import qacinema.data.booking.Payment;
import qacinema.data.booking.tickets.CustomerType;
import qacinema.data.booking.tickets.DaysOfWeek;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.booking.tickets.TicketType;
import qacinema.data.booking.tickets.TimesOfDay;
import qacinema.data.cinema.Screen;
import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.users.Address;
import qacinema.data.users.User;

@Default
@Startup
@Singleton
public class TestData {

	private Map<Integer,Ticket> ticketMap; 
	private Map<Integer,Showing> showingMap;
	private Map<Integer,Film> filmMap;
	private Map<Integer,Actor> actorMap;
	private Map<Integer,User> userMap;
	private Map<Integer,Booking> bookingMap;
	private Map<Integer,TicketType> ticketTypeMap;
	private Map<Integer,Payment> paymentMap;
	private Map<Integer,Seat> seatMap;
	private Map<Integer,Screen> screenMap;
	private Map<Integer,Address> addressMap;
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@PostConstruct
	private void setupTestData() { 
		ticketMap = new HashMap<>();
		showingMap = new HashMap<>();
		filmMap = new HashMap<>();
		actorMap = new HashMap<>();
		userMap = new HashMap<>();
		bookingMap = new HashMap<>();
		ticketTypeMap = new HashMap<>();
		paymentMap = new HashMap<>();
		seatMap = new HashMap<>();
		screenMap = new HashMap<>();
		addressMap = new HashMap<>();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public TicketType ticketType = new TicketType("child", 6.99f, CustomerType.CHILD, DaysOfWeek.ALL, TimesOfDay.ALL_DAY);
	public Payment payment = new Payment("1", "Credit Card", true, "12345678910", "johndoe@gmail.com");
	public Seat seat = new Seat("A1","Fluffy");
	public Film film = new Film("The Human Centipede", 108, "We all know the movie. We all love it. Feeeeeeed him", "2014");
	public Screen screen = new Screen("1",100,"2D");
	public Showing showing = new Showing("1", film, screen, "22022017160000", "2D", "Audio Described");
	public Ticket ticket = new Ticket("1", ticketType, seat, showing);
	public Actor actor = new Actor("Tom", "Hanks");
	public User user = new User("johndoe@gmail.com","iamjohndoe","Standard","John","Doe","0123456",true);
	public Booking booking = new Booking("1","12:00",user,payment);
	public Address address = new Address("1","123 Fake Street","Fake Area","Fake Town","Fake County", "AB1 2CD");// address
										
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Have a check of the "setID" method within your class to make sure that its either the same as used here, or change to
	 * make it appear here the same as in your class

	 * 
	 */
	
	
	public void addAddress(Address address) {
		address.setAddressID(""+address.hashCode());
		address.setCounty(address.getCounty());///////////////////////////////////////
		address.setLine1(address.getLine1());/////////////////////////////////////////
		address.setLine2(address.getLine2());//////////////  NEEDED?  ////////////////
		address.setPostcode(address.getPostcode());///////////////////////////////////
		address.setTown(address.getTown());///////////////////////////////////////////
		this.addressMap.put(address.hashCode(), address);
	}
	
	public void addTicket(Ticket ticket) { 
		ticket.setID(""+ticket.hashCode());
		this.ticketMap.put(ticket.hashCode(),ticket);
	}
	
	public void addUser(User user) { 
		user.set(""+user.hashCode());
		this.userMap.put(user.hashCode(),user);
	}
	
	public void addTickets(Booking booking) { 
		booking.setBookingid(""+booking.hashCode());
		booking.set
		this.bookingMap.put(booking.hashCode(),booking);
	}
	
	public void addTicketType(TicketType ticketType) { 
		ticketType.setType(""+ticketType.hashCode());
		this.ticketTypeMap.put(ticketType.hashCode(),ticketType);
	}
	
	public void addPayment(Payment payment) { 
		payment.setPaymentsid(""+payment.hashCode());
		this.paymentMap.put(payment.hashCode(),payment);
	}
	
	public void addSeat(Seat seat) {
		seat.set(""+seat.hashCode());
		this.seatMap.put(seat.hashCode(),seat);
	}
	
	public void addScreen(Screen screen) { 
		screen.setScreenID(""+screen.hashCode());
		this.screenMap.put(screen.hashCode(),screen);
	}

	public void addShowing(Showing showing) { 
		showing.setShowingID(""+showing.hashCode());
		this.showingMap.put(showing.hashCode(),showing);
	}
	
	public void addFilm(Film film) { 
		film.set(""+film.hashCode());
		this.filmMap.put(film.hashCode(),film);
	}
	
	public void addActor(Actor actor) { 
		actor.set(""+actor.hashCode());
		this.actorMap.put(actor.hashCode(),actor);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Map<Integer, Ticket> getTicketMap() {
		return ticketMap;
	}

	public void setTicketMap(Map<Integer, Ticket> ticketMap) {
		this.ticketMap = ticketMap;
	}

	public Map<Integer, Showing> getShowingMap() {
		return showingMap;
	}

	public void setShowingMap(Map<Integer, Showing> showingMap) {
		this.showingMap = showingMap;
	}

	public Map<Integer, Film> getFilmMap() {
		return filmMap;
	}

	public void setFilmMap(Map<Integer, Film> filmMap) {
		this.filmMap = filmMap;
	}

	public Map<Integer, Actor> getActorMap() {
		return actorMap;
	}

	public void setActorMap(Map<Integer, Actor> actorMap) {
		this.actorMap = actorMap;
	}

	public Map<Integer, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<Integer, User> userMap) {
		this.userMap = userMap;
	}

	public Map<Integer, Booking> getBookingMap() {
		return bookingMap;
	}

	public void setBookingMap(Map<Integer, Booking> bookingMap) {
		this.bookingMap = bookingMap;
	}

	public Map<Integer, TicketType> getTicketTypeMap() {
		return ticketTypeMap;
	}

	public void setTicketTypeMap(Map<Integer, TicketType> ticketTypeMap) {
		this.ticketTypeMap = ticketTypeMap;
	}

	public Map<Integer, Payment> getPaymentMap() {
		return paymentMap;
	}

	public void setPaymentMap(Map<Integer, Payment> paymentMap) {
		this.paymentMap = paymentMap;
	}

	public Map<Integer, Seat> getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(Map<Integer, Seat> seatMap) {
		this.seatMap = seatMap;
	}

	public Map<Integer, Screen> getScreenMap() {
		return screenMap;
	}

	public void setScreenMap(Map<Integer, Screen> screenMap) {
		this.screenMap = screenMap;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Showing getShowing() {
		return showing;
	}

	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}


}
