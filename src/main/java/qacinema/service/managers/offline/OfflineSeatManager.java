
package qacinema.service.managers.offline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;
import qacinema.service.managers.Seat_Manager;
import qacinema.testdata.TestData;

@Stateless
public class OfflineSeatManager implements Seat_Manager {
	@Inject
	TestData testData;

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, Film film) {
		String date = Utilities.getDate();
		Map<Integer, Ticket> ticketList = testData.getTicketMap();
		Map<Integer, Showing> showings = testData.getShowingMap();
		Map<String, Integer> seats = null;
		List<String> seatsNextToEachOther = new ArrayList<String>();
		Showings.checkShowingsForFilmsMatchingToday(film, date, ticketList, showings, seats);
		Seats.getEmptySeatsNextToeachOther(number_of_seats, seats, seatsNextToEachOther);
		return seatsNextToEachOther;
	}

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, String film) {
		Map<Integer, Film> films = testData.getFilmMap();
		Film filmToSearch = null;
		filmToSearch = searchAllFilmsToMatchTitle(film, films, filmToSearch);
		List<String> seatsNextToEachOther = findSeatsNextToEachOther(number_of_seats, filmToSearch);
		return seatsNextToEachOther;
	}

	private Film searchAllFilmsToMatchTitle(String film, Map<Integer, Film> films, Film filmToSearch) {
		for (Entry<Integer, Film> filmFromList : films.entrySet()) {
			filmToSearch = checkIfFilmIsTitleString(film, (Film) filmFromList);
		}
		return filmToSearch;
	}

	private Film checkIfFilmIsTitleString(String film, Film filmFromList) {
		Film filmToSearch = null;
		if (isFilmTitleSameAsString(film, filmFromList)) {
			filmToSearch = filmFromList;
		}
		return filmToSearch;
	}

	private boolean isFilmTitleSameAsString(String film, Film filmFromList) {
		return filmFromList.getTitle().contains(film);
	}

	@Override
	public List<String> findSeatsNextToEachOther(int number_of_seats, Showing showing) {
	
		String date = showing.getDateTime();
		Film film = showing.getFilm();
		Map<Integer, Ticket> ticketList = testData.getTicketMap();
		Map<String, Integer> seats = null;
		List<String> seatsNextToEachOther = new ArrayList<String>();
		Showings.checkShowingIsForTodayAndSelectedFilm(film, date, ticketList, seats, showing);
		Seats.getEmptySeatsNextToeachOther(number_of_seats, seats, seatsNextToEachOther);
		return seatsNextToEachOther;
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
	public Map<String, Integer> fildAllSeats(Showing showing) {
		Map<String, Integer> seats = null;
		Seats.setEmptySeats(seats, showing);
		return seats;
	}

	@Override
	public List<String> findFirstFreeSeat(Showing showing) {
		return findSeatsNextToEachOther(1, showing);
	}
}
