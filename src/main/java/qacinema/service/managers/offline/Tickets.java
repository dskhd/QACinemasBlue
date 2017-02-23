package qacinema.service.managers.offline;


import java.util.List;
import java.util.Map;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.cinema.Showing;

public class Tickets {
	static void checkAllTicketsForShowing(Map<Integer, Ticket> ticketList, Map<String, Integer> seats, Showing showing) {
		for (Map.Entry<Integer, Ticket> ticket : ticketList.entrySet()) {
			Seats.setSeatToOccupied(seats, showing, (Ticket) ticket);
		}
	}
}
