package qa_cinema.service.managers.offline;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import qa_cinema.annotations.Loggable;
import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.service.managers.BookingManager;
import qa_cinema.test_data.TestData;

@Default
@Stateless
@Loggable
public class OfflineBookingManager implements BookingManager {

	@Inject private TestData testData;
	
	
	@Override
	public Booking persistBooking(Booking booking) {
		int id = testData.getBookingMap().size();
		booking.setBookingid(""+id);
		testData.setBooking(booking);
		return booking;
	}

	@Override
	public Booking findByBookingId(int bookingid){
		Map<Integer, Booking> bookMap = testData.getBookingMap();
		for (Entry<Integer, Booking> booking : bookMap.entrySet()){
			if ()
				return booking;
		}
		
	
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
