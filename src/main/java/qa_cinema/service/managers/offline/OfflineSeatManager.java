
package qa_cinema.service.managers.offline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Film;
import qa_cinema.service.managers.Seat_Manager;
import qa_cinema.test_data.TestData;

@Stateless
public class OfflineSeatManager implements Seat_Manager {
	@Inject
	TestData testData;

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, Film film) {
		String date = Utilities.getDate();
		List<Ticket> ticketList = testData.getTicketList();
		List<Showing> showings = testData.getShowingList();
		Map<String, Integer> seats = null;
		List<String> seatsNextToEachOther = new ArrayList<String>();
		Showings.checkShowingsForFilmsMatchingToday(film, date, ticketList, showings, seats);
		Seats.getEmptySeatsNextToeachOther(number_of_seats, seats, seatsNextToEachOther);
		return seatsNextToEachOther;
	}

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, Showing showing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAvailableSeatsNextToSeat(String seat, Film film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAvailableSeatsNextToSeat(String seat, String film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAvailableSeatsNextToSeat(String seat, Showing showing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fildAllSeats() {
		// TODO Auto-generated method stub
		return null;
	}
}
