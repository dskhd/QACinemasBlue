package qacinema.service.managers.offline;

import java.util.List;
import java.util.Map;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;

public class Showings {
	static void checkShowingIsForTodayAndSelectedFilm(Film film, String date, List<Ticket> ticketList, Map<String, Integer> seats, Showing showing) {
		if (showing.getDateTime().equals(date) && showing.getFilm().equals(film)) {
			Seats.setSeatsForScreenCapacity(seats, showing);
			Tickets.checkAllTicketsForShowing(ticketList, seats, showing);
		}
	}
	static void checkShowingsForFilmsMatchingToday(Film film, String date, List<Ticket> ticketList, List<Showing> showings, Map<String, Integer> seats) {
		for (Showing showing : showings) {
			Showings.checkShowingIsForTodayAndSelectedFilm(film, date, ticketList, seats, showing);
		}
	}

}
