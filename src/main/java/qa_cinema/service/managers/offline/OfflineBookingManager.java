package qa_cinema.service.managers.offline;

import java.util.List;

import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.service.managers.BookingManager;

public class OfflineBookingManager implements BookingManager {

	@Override
	public Booking persistBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking findByBookingId(int bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> findAllTickets(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> findByPaymentID(int paymentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

}
