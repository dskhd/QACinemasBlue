/*Author: Alex Dawkes*/
package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import qacinema.annotations.Loggable;
import qacinema.data.booking.Booking;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.users.User;
import qacinema.service.managers.BookingManager;
import qacinema.testdata.TestData;


@Default
@Stateless
@Loggable
public class OfflineBookingManager implements BookingManager {

	@Inject
	private TestData testData;

	@Override
	public Booking persistBooking(Booking booking) { //This needs fixing or the test is wrong or something
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
	public List<Booking> findAllBookings() {
		List<Booking> allBookings = new ArrayList<>();
		for (Booking booking : testData.getBookingMap().values()){
			allBookings.add(booking);
		}
		return allBookings;
	}

	@Override
	public List<Booking> findByUser(User user) {
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
			if(booking.getPayment().getPaymentsid().equals(paymentid)){
				payBookings.add(booking);
			}
		}
		return payBookings;
	}

	@Override
	public void updateBooking(Booking bookingToUpdate) {
		for (Booking booking : testData.getBookingMap().values()){
			if(booking.equals(bookingToUpdate)){
				//Enter code that updates it to whatever, probably need to overload this method
				//so you can put in multiple things to update
			}
		}

	}

	@Override
	public void deleteBooking(Booking bookingToDelete) {
		for (Booking booking : testData.getBookingMap().values() ){
			if(booking.equals(bookingToDelete)){
				testData.getBookingMap().remove(bookingToDelete.getBookingid());
			}
		}

	}

	@Override
	public void addTicketToBooking(String bookingid, Ticket ticketToAdd) {
		for (Booking booking : testData.getBookingMap().values()){
			if(booking.getBookingid().equals(bookingid)){
				booking.addTicket(ticketToAdd);
			}
		}
	}

	@Override
	public void removeTicketFromBooking(String bookingid, String ticketID) {
				List<Ticket> bookedTickets = testData.getBookingMap().get(bookingid).getTickets();
				for (Ticket ticket : bookedTickets){
					if(ticket.getTicketID().equals(ticketID)){
						bookedTickets.remove(ticketID);
					}
				}
			}

		
		
	}