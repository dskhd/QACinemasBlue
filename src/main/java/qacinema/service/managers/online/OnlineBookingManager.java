package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.booking.Booking;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;
import qacinema.service.managers.BookingManager;


@Alternative @Stateless @Loggable @Transactional(
		rollbackOn=Exception.class)
public class OnlineBookingManager implements BookingManager {

	@PersistenceContext(
			unitName="QACinemasBlue")
	private EntityManager eM;
	
	@Override
	public Booking persistBooking(Booking booking) {
		eM.getTransaction().begin();
		eM.persist(booking);
		eM.getTransaction().commit();
		return findByBookingId(booking.getBookingid());
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
