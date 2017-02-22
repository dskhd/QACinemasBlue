package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qacinema.data.film.Film;
import qacinema.service.managers.FilmManager;
import qacinema.test_data.TestData;

@Stateless 
public class FilmManagerOffline implements FilmManager {
	
	@Inject
	private TestData testData;
	
	@Override
	public Film persistFilm(Film film) {
		testData.addFilm(film);
		return testData.getFilmMap().get(film.hashCode());
	}

	@Override
	public Film findById(int filmId) {
		return testData.getFilmMap().get(filmId);
	}

	@Override
	public List<Film> findByTitle(String title) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values())
			if(film.getTitle().contains(title))
				results.add(film);
		return results;
	}

	@Override
	public List<Film> findByGenre(String genre) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values())
			if(film.getGenres().contains(genre))
				results.add(film);
		return results;
	}

	@Override
	public List<Film> findByActor(String actor) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values())
			if(film.getActors().contains(actor))
				results.add(film);
		return results;
	}

	@Override
	public List<Film> findByDate(String date) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values())
			if(film.getDate().contains(date))
				results.add(film);
		return results;
	}

	@Override
	public List<Film> findAll() {
		return new ArrayList<>(testData.getFilmMap().values());
	}
	
}
