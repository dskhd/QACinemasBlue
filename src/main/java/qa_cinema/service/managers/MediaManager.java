package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.film.Film;
import qa_cinema.data.film.Media;

public interface MediaManager {
	List<Media> findImagesByFilm(Film film);
	List<Media> findVideosByFilm(Film film);
	List<Media> findSoundClipsByFilm(Film film);
	Media findFilmPoster(Film film);
	Media findFilmPosterByName(String name);
	
}
