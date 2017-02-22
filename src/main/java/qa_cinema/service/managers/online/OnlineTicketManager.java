package qa_cinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;
import qa_cinema.service.managers.TicketManager;


@Alternative
@Stateless
@Loggable
public class OnlineTicketManager implements TicketManager {

	@Override
	public Ticket persistTicket(Ticket ticket) {
		
		return null;
	}

	@Override
	public Ticket findTicketByID(String id) {
		
		return null;
	}

	@Override
	public List<Ticket> getTicketsFromUser(User user) {
		
		return null;
	}

	@Override
	public List<Ticket> getTicketsFromFilm(User user, Film film) {
		
		return null;
	}
	
}
