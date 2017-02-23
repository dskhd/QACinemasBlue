package qacinema.service.managers.offline;



import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Tickets;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;

public class Showings {
	static void checkShowingIsForTodayAndSelectedFilm(Film film, String date, Map<Integer, Ticket> ticketList, Map<String, Integer> seats, Showing showing) {
		if (showing.getDateTime().equals(date) && showing.getFilm().equals(film)) {
			Seats.setEmptySeats(seats, showing);
			
			Tickets.checkAllTicketsForShowing(ticketList, seats, showing);
		}
	}

	static void checkShowingsForFilmsMatchingToday(Film film, String date, Map<Integer, Ticket> ticketList, Map<Integer, Showing> showings, Map<String, Integer> seats) {
		for (Map.Entry<Integer, Showing> showing : showings.entrySet()) {
			Showings.checkShowingIsForTodayAndSelectedFilm(film, date, ticketList, seats, (Showing) showing);
		}
	}
	

	
}
