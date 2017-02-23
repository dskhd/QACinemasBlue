/*//
 * Created by Martyn Green
*/
package qacinema.service.managers;

import java.util.List;
import java.util.Map;

import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;

public interface Seat_Manager {
	public List<String> findSeatsNextToEachOther(int number_of_seats, Film film);
	public List<String> findSeatsNextToEachOther(int number_of_seats, String film);
	public List<String> findSeatsNextToEachOther(int number_of_seats, Showing showing);
	public List<String> findFirstFreeSeat(Showing showing);
	public List<String> findAvailableSeatsNextToSeat(String seat , Film film);
	public List<String> findAvailableSeatsNextToSeat(String seat , String film);
	public List<String> findAvailableSeatsNextToSeat(String seat , Showing showing);
	public Map<String, Integer> fildAllSeats(Showing showing);
	}
