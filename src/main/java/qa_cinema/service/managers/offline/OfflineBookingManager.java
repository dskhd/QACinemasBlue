package qa_cinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.users.User;
import qa_cinema.service.managers.BookingManager;
import qa_cinema.test_data.TestData;

@Default
@Stateless
@Loggable
public class OfflineBookingManager implements BookingManager {

	@Inject
	private TestData testData;

	@Override
	public Booking persistBooking(Booking booking) {
		int id = testData.getBookingMap().size();
		booking.setBookingid("" + id);
		testData.setBooking(booking);
		return booking;
	}

	@Override
	public Booking findByBookingId(String bookingid) throws NoResultException {
		Map<Integer, Booking> bookMap = testData.getBookingMap();
		for (Entry<Integer, Booking> booking : bookMap.entrySet()) {
			if (booking.getValue().getBookingid().equals(bookingid)) {
				return booking.getValue();
			}
		}
		throw new NoResultException("No matching BookingID found.");

	}

	@Override
	public List<Booking> findByEmail(User user) {
		List<Booking> userBookings = new ArrayList<>();
		for (Booking booking : testData.getBookingMap().values()){
			if(booking.getUser() == user){
				userBookings.add(booking);
			}
		}
		return userBookings;
	}

	@Override
	public List<Ticket> findAllTickets(Booking booking) {
		List<Ticket> bookedTickets = new ArrayList<>();
		for(Booking mapBooking: testData.getBookingMap().values()){
			if(mapBooking.equals(booking)){
				bookedTickets.addAll(booking.getTickets());
			}
		}
		return bookedTickets;
	}

	@Override
	public List<Booking> findByPaymentID(String paymentid) {
		List<Booking> payBookings = new ArrayList<>();
		for(Booking booking : testData.getBookingMap().values()){
			if(booking.getPaymentsid().equals(paymentid)){
				payBookings.add(booking);
			}
		}
		return payBookings;
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
