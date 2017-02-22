/*//
 * Created by Martyn Green
*/
package qacinema.service.managers;

import java.util.List;

import qacinema.data.cinema.Screen;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;


public interface Screen_Manager {
	
	public List<Screen> FindScreenByFilm(Film film);
	public List<Screen> FindScreenByFilm(String film);
	public List<Screen> FindScreenByShowing(Showing showing);
	public List<Screen> FindScreenByDateTime(String date, String time);
		}
