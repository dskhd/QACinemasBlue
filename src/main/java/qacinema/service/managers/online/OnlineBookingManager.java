package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
		return eM.find(Booking.class, bookingid);
	}
	
	@Override
	public List<Booking> findAllBookings() {
		TypedQuery<Booking> query = eM.createNamedQuery(Booking.FIND_ALL,  Booking.class);
		return query.getResultList();
	}

	@Override
	public List<Booking> findByUser(User user) {
		TypedQuery<Booking> query = eM.createNamedQuery(Booking.FIND_BY_USER, Booking.class);
		query.setParameter("userEmail", user); //"userEmail" or "user"?
		return query.getResultList();
	}

	@Override
	public List<Ticket> findAllTickets(Booking booking) {
		eM.find(Booking.class, booking.getBookingid());
		List<Ticket> bookedTickets = booking.getTickets();
		return bookedTickets;
	}

	@Override
	public List<Booking> findByPaymentID(String paymentid) {
		TypedQuery<Booking> query = eM.createNamedQuery(Booking.FIND_BY_PAYMENTID, Booking.class);
		query.setParameter("paymentsID", paymentid);
		return query.getResultList();
	}

	@Override
	public void updateBooking(Booking booking) {
	eM.getTransaction().begin();
	eM.merge(booking);
	eM.getTransaction().commit();
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
