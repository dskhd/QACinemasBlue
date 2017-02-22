package qa_cinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;
import qa_cinema.service.managers.TicketManager;
import qa_cinema.test_data.TestData;

@Default
@Stateless
@Loggable
public class OfflineTicketManager implements TicketManager{
	
	@Inject private TestData testData;

	@Override
	public Ticket persistTicket(Ticket ticket) {
		int id = testData.getTicketList().size();
		ticket.setID("" + id);
		testData.addTicket(ticket);
		return ticket;
	}

	@Override
	public Ticket findTicketByID(String id) {
		for(Ticket ticket : testData.getTicketList()){
			if(ticket.getTicketID().equals(id)){
				return ticket;
			}
		}
		
		return new Ticket();
	}

	@Override
	public List<Ticket> getTicketsFromUser(User user) {
		List<Ticket> tickets = new ArrayList<>();
		
		for(Booking booking : testData.getBookingList() ){
			if(booking.getUser() == user){
				tickets.add(booking.getTickets())
			}
		}
		return tickets;
	}

	@Override
	public List<Ticket> getTicketsFromFilm(User user, Film film) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
