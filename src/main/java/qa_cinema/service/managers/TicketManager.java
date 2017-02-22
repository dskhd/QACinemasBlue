package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;

public interface TicketManager {
	
	Ticket persistTicket(Ticket ticket);
	Ticket findTicketByID(String id);
	List<Ticket> getTicketsFromUser(User user);
	List<Ticket> getTicketsFromFilm(User user, Film film);
	
}
