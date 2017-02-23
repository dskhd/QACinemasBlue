package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import qacinema.annotations.Loggable;
import qacinema.data.booking.Booking;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.film.Film;
import qacinema.data.users.User;
import qacinema.service.managers.TicketManager;
import qacinema.testdata.TestData;

@Default
@Stateless
@Loggable
public class OfflineTicketManager implements TicketManager{
	
	@Inject private TestData testData;

	@Override
	public Ticket persistTicket(Ticket ticket) {
		OfflineSeatManager seatManager = new OfflineSeatManager();
		int id = testData.getTicketMap().size();
		ticket.setID("" + id);
		ticket.setSeat(seatManager.);
		testData.addTicket(ticket);
		return ticket;
	}

	@Override
	public Ticket findTicketByID(String id) throws NoResultException{
		for(Ticket ticket : testData.getTicketMap().values()){
			if(ticket.getTicketID().equals(id)){
				return ticket;
			}
		}
		
		throw new NoResultException("No Matching Id");
	}

	@Override
	public List<Ticket> getTicketsFromUser(User user) {
		List<Ticket> tickets = new ArrayList<>();
		
		for(Booking booking : testData.getBookingMap().values() ){
			if(booking.getUser() == user){
				tickets.addAll(booking.getTickets());
			}
		}
		return tickets;
	}

	@Override
	public List<Ticket> getTicketsFromFilm(User user, Film film) {
		List<Ticket> tickets = getTicketsFromUser(user);
		for(Ticket ticket : tickets){
			if(ticket.getShowing().getFilm() != film){
				tickets.remove(ticket);
			}
		}
		
		return tickets;
	}
	
}
