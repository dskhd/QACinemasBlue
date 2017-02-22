/**
 * Created by Mark Lester
 */
package qacinema.service.managers;

import java.util.List;

import qacinema.data.film.Film;
import qacinema.data.users.User;

public interface UserRatingManager {
	
	
	
	public int getRatingId();
	public int getRating();
	public String getComment();
	public User getReviewer();
	public List<Film> getFilms();
	
	public int setRating();
	public String setComment();
	public User setReviewer();
	public Film setFilm();
	
	

}
