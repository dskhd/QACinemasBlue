/*Author: Alex Dawkes*/
package qacinema.service.managers;

import java.util.List;

import qacinema.data.booking.Booking;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;

public interface BookingManager {

	public Booking persistBooking(Booking booking);
	public Booking findByBookingId(String bookingid);
	public List<Booking> findAllBookings();
	public List<Booking> findByUser(User user);
	public List<Ticket> findAllTickets(Booking booking);
	public List<Booking> findByPaymentID(String paymentid);
	public void updateBooking(Booking booking);
	public void deleteBooking(Booking booking);
	public void addTicketToBooking(String bookingid, Ticket ticketToAdd);
	public void removeTicketFromBooking(String bookingid, String ticketID);
		
}
