package qacinema.service.managers;

import java.util.Date;
import java.util.List;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;

public interface ShowingManager {
	
	public List<Showing> allShowings();
	public List<Showing> findByHour(Date hour);
	public List<Showing> findByDay(Date date);
	public List<Showing> findByFilm(Film film);
	public List<Showing> byExperience(String experience);
	public List<Showing> byAccessibility(String accessibility);
	
	
}


