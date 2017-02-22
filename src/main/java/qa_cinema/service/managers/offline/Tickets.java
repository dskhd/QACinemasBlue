package qa_cinema.service.managers.offline;

import java.util.List;
import java.util.Map;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.cinema.Showing;

public class Tickets {
	static void checkAllTicketsForShowing(List<Ticket> ticketList, Map<String, Integer> seats, Showing showing) {
		for (Ticket ticket : ticketList) {
			Seats.setSeatToOccupied(seats, showing, ticket);
		}
	}
}
