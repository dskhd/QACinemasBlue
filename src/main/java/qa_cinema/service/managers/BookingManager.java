/*Author: Alex Dawkes*/
package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.users.User;

public interface BookingManager {

	public Booking persistBooking(Booking booking);
	public Booking findByBookingId(String bookingid);
	public List<Booking> findByEmail(User user);
	public List<Ticket> findAllTickets(Booking booking);
	public List<Booking> findByPaymentID(String paymentid);
	public void updateBooking(Booking booking);
	public void deleteBooking(Booking booking);
		
}
