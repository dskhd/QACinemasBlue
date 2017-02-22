package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;

public interface TicketManager {
	
	Ticket persistTicket(Ticket ticket);
	Ticket findTicketByID(User user, String id);
	List<Ticket> findTicketsByUser(User user);
	List<Ticket> findTicketsByFilm(User user, Film film);
}
