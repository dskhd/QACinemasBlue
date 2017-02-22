/*Author: Alex Dawkes*/
package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;

public interface BookingManager {

	public Booking persistBooking(Booking booking);
	public Booking findByBookingId(int bookingid);
	public List<Booking> findByEmail(String email);
	public List<Ticket> findAllTickets(Booking booking);
	public List<Booking> findByPaymentID(int paymentid);
	public void updateBooking(Booking booking);
	public void deleteBooking(Booking booking);
		
}
