package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import qacinema.annotations.Loggable;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.film.Film;
import qacinema.data.users.User;
import qacinema.service.managers.TicketManager;


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
