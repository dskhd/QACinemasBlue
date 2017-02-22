package qacinema.service.managers;

import java.util.List;

import qacinema.data.film.Film;

public interface FilmManager {
	
	public Film persistFilm(Film film);
	public Film findById(int filmId);
	public List<Film> findByTitle(String title);
	public List<Film> findByGenre(String genre);
	public List<Film> findByActor(String actor);
	public List<Film> findByDate(String date);
	public List<Film> findAll();

}
