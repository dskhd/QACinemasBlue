package qacinema.service.managers;

import java.util.List;

import qacinema.data.film.Film;
import qacinema.data.film.Media;

public interface MediaManager {
	List<Media> findAllMediaByFilm(Film film);
	List<Media> findAllMediaByName(String name);	
	List<Media> findImagesByFilm(Film film);
	List<Media> findVideosByFilm(Film film);
	List<Media> findThumbnailByFilm(Film film);
	Media findFilmPoster(Film film);
	Media findFilmPosterByName(String name);
	
}
