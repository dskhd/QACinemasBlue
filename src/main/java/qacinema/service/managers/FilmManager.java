package qacinema.service.managers;

import java.util.List;

import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.film.Genre;
import qacinema.data.film.Role;

public interface FilmManager {
	
	public Film persistFilm(Film film);
	public Actor persistActor(Actor actor);
	public Film findById(int filmId);
	public List<Film> findByTitle(String title);
	public List<Genre> findByGenre(String genre);
	public List<Actor> findByActor(String actor);
	public List<Role> findByRole(String role);
	public List<Film> findByDate(String date);
	public List<Film> findAll();

}
