package qa_cinema.managers;

import java.util.List;
import qa_cinema.data.cinema.Showing;
import qa_cinema.data.film.Film;

public interface ShowingManager {
	
	public List<Showing> allShowings();
	public List<Showing> findByHour(String hour);
	public List<Showing> findByDay(String date);
	public List<Showing> findByFilm(Film film);
	public List<Showing> findByfilm(String film);
	public List<Showing> byExperience(String experience);
	public List<Showing> byAccessabillity(String accessability);
	
	
}


