package qa_cinema.service.managers;

import qa_cinema.data.booking.tickets.Ticket;

public interface TicketManager {
	
	Ticket persistTicket(Ticket ticket);
	Ticket findTicketByID(String id);
	
}
