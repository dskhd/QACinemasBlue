package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.film.Film;
import qa_cinema.data.users.User;

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
