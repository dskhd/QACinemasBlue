package qacinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.film.Role;
import qacinema.service.managers.FilmManager;
import qacinema.testdata.TestData;


@Stateless 
public class OfflineFilmManager implements FilmManager {
	
	@Inject
	private TestData testData;
	
	@Override
	public Film persistFilm(Film film) {
		testData.addFilm(film);
		return testData.getFilmMap().get(film.hashCode());
	}
	
	@Override
	public Actor persistActor(Actor actor) {
		testData.addActor(actor);
		return testData.getActorMap().get(actor.hashCode());
	}

	@Override
	public Film findById(int filmId) {
		return testData.getFilmMap().get(filmId);
	}

	@Override
	public List<Film> findByTitle(String title) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values()){
			if(film.getTitle().contains(title))
				results.add(film);
		}
		return results;
	}

	@Override
	public List<Film> findByGenre(String genre) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values()){
			if(film.getGenres().contains(genre))
				results.add(film);
		}
		return results;
	}

	@Override
	public List<Actor> findByActor(String name) {
		List<Actor> results = new ArrayList<Actor>();
		for (Actor actors : testData.getActorMap().values()){
			String actorName = actors.getFirstName() + " " + actors.getLastName();
			if(actorName.contains(name))
				results.add(actors);
		}
		return results;
	}
	
	@Override
	public List<Role> findByRole(String role) {
		List<Role> results = new ArrayList<Role>();
		for (Role roles : testData.getRoleMap().values()){
			if(roles.getRole().contains(role))
				results.add(roles);
		}
		return results;
	}

	@Override
	public List<Film> findByDate(String date) {
		List<Film> results = new ArrayList<Film>();
		for(Film film : testData.getFilmMap().values()){
			if(film.getDate().contains(date))
				results.add(film);
		}
		return results;
	}

	@Override
	public List<Film> findAll() {
		return new ArrayList<>(testData.getFilmMap().values());
	}

	
}
