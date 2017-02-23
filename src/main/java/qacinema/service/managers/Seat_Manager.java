/*//
 * Created by Martyn Green
*/
package qacinema.service.managers;

import java.util.Map;

import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;

public interface Seat_Manager {
	public Seat findFirstFreeSeat(Showing showing);
	public Map<Seat, Boolean> fildAllSeats(Showing showing);

	}
