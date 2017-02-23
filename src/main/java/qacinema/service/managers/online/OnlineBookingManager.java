package qacinema.service.managers.online;

import java.util.List;

import qacinema.data.booking.Booking;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;
import qacinema.service.managers.BookingManager;

public class OnlineBookingManager implements BookingManager {

	@Override
	public Booking persistBooking(Booking booking) {
		
		return null;
	}

	@Override
	public Booking findByBookingId(String bookingid) {
		
		return null;
	}

	@Override
	public List<Booking> findByUser(User user) {
		
		return null;
	}

	@Override
	public List<Ticket> findAllTickets(Booking booking) {
		
		return null;
	}

	@Override
	public List<Booking> findByPaymentID(String paymentid) {
		
		return null;
	}

	@Override
	public void updateBooking(Booking booking) {
	
		
	}

	@Override
	public void deleteBooking(Booking booking) {
	
	}

	@Override
	public void addTicketToBooking(String bookingid, Ticket ticketToAdd) {
		
		
	}

	@Override
	public void removeTicketFromBooking(String bookingid, String ticketID) {
	
		
	}

}
