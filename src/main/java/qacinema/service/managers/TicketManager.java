package qacinema.service.managers;

import java.util.List;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.film.Film;
import qacinema.data.users.User;

public interface TicketManager {
	
	Ticket persistTicket(Ticket ticket);
	Ticket findTicketByID(String id);
	List<Ticket> getTicketsFromUser(User user);
	List<Ticket> getTicketsFromFilm(User user, Film film);
	
}
