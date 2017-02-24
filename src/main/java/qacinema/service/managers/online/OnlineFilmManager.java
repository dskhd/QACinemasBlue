package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.film.Actor;
import qacinema.data.film.Film;
import qacinema.data.film.Genre;
import qacinema.data.film.Role;
import qacinema.service.managers.FilmManager;

@Alternative @Stateless @Loggable @Transactional(rollbackOn= Exception.class)
public class OnlineFilmManager implements FilmManager {

	@PersistenceContext(unitName = "QACubenasBluePU") //TODO change
	private EntityManager entityManager;
	
	
	
	@Override
	public Film persistFilm(Film film) {
		entityManager.getTransaction().begin();
		entityManager.persist(film);
		entityManager.getTransaction().commit();
		return null; //TODO change
	}

	@Override
	public Actor persistActor(Actor actor) {
		entityManager.getTransaction().begin();
		entityManager.persist(actor);
		entityManager.getTransaction().commit();
		return null;
	}

	@Override
	public Film findById(int filmId) {
		return entityManager.find(Film.class, filmId);
	}

	@Override
	public List<Film> findByTitle(String title) {
		TypedQuery<Film> query = entityManager.createNamedQuery(Film.FIND_BY_NAME, Film.class);
		query.setParameter("title", title);
		return query.getResultList();
	}

	@Override
	public List<Genre> findByGenre(String genre) {
		TypedQuery<Genre> query = entityManager.createNamedQuery(Film.FIND_BY_NAME, Genre.class);
		query.setParameter("genre", genre);
		return query.getResultList();
	}

	@Override
	public List<Actor> findByActor(String actor) {
		TypedQuery<Actor> query = entityManager.createNamedQuery(Film.FIND_BY_NAME, Actor.class);
		query.setParameter("actor", actor);
		return query.getResultList();
	}

	@Override
	public List<Role> findByRole(String role) {
		TypedQuery<Role> query = entityManager.createNamedQuery(Film.FIND_BY_NAME, Role.class);
		query.setParameter("roles", role);
		return query.getResultList();
	}

	@Override
	public List<Film> findByDate(String date) {
		TypedQuery<Film> query = entityManager.createNamedQuery(Film.FIND_BY_NAME, Film.class);
		query.setParameter("date", date);
		return query.getResultList();
	}

	@Override
	public List<Film> findAll() {
		TypedQuery<Film> query = entityManager.createNamedQuery(Film.FIND_ALL, Film.class);
		return query.getResultList();
	}

}
