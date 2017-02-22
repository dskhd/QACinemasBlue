/*//
 * Created by Martyn Green
*/
package qa_cinema.managers;

import java.util.List;

import qa_cinema.data.cinema.Screen;
import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Film;


public interface Screen_Manager {
	public List<Screen> FindScreenByFilm(Film film);
	public List<Screen> FindScreenByFilm(String film);
	public List<Screen> FindScreenByShowing(Showing showing);
	public List<Screen> FindScreenByDateTime(String date, String time);
		}
