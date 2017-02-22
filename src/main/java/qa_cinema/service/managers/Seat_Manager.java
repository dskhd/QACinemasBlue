/*//
 * Created by Martyn Green
*/
package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.cinema.Seat;
import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Film;

public interface Seat_Manager {
	public List<String> findSeatsNextToEachOther(int number_of_seats, Film film);
	public List<String> findSeatsNextToEachOther(int number_of_seats, String film);
	public List<String> findSeatsNextToEachOther(int number_of_seats, Showing showing);
	public List<String> findAvailableSeatsNextToSeat(String seat , Film film);
	public List<String> findAvailableSeatsNextToSeat(String seat , String film);
	public List<String> findAvailableSeatsNextToSeat(String seat , Showing showing);
	public List<String> fildAllSeats();
	}
