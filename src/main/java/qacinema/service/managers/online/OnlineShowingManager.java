package qacinema.service.managers.online;

import java.util.Date;

/*
 * Created by James Lamkin
 */

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.cinema.Showing;
import qacinema.data.film.Film;
import qacinema.service.managers.ShowingManager;

@Alternative @Stateless @Loggable @Transactional(rollbackOn=Exception.class)
public class OnlineShowingManager implements ShowingManager {
	
	@PersistenceContext(unitName="QACinemasBluePU")
	private EntityManager entityManager;
	
	public Showing persistShowing(Showing showing){
		entityManager.getTransaction().begin();
		entityManager.persist(showing);
		entityManager.getTransaction().commit();
		return null; //TODO change
	}

	@Override
	public List<Showing> allShowings() {
		TypedQuery<Showing> query = entityManager.createNamedQuery(Showing.FIND_ALL, Showing.class);
		return query.getResultList();
	}

	@Override
	public List<Showing> findByHour(Date hour) {
		TypedQuery<Showing>	query = entityManager.createNamedQuery(Showing.FIND_BY_DATE_TIME, Showing.class);
		query.setParameter("showingTime", hour);
		return query.getResultList();
	}

	@Override
	public List<Showing> findByDay(Date date) {
		TypedQuery<Showing> query = entityManager.createNamedQuery(Showing.FIND_BY_DATE_TIME, Showing.class);
		query.setParameter("showingTime", date);
		return query.getResultList();
	}

	@Override
	public List<Showing> findByFilm(Film film) {
		TypedQuery<Showing> query = entityManager.createNamedQuery(Showing.FIND_BY_FILMID, Showing.class);
		query.setParameter("filmID", film.getFilmId());
		return query.getResultList();
	}

	@Override
	public List<Showing> byExperience(String experience) {
		TypedQuery<Showing> query = entityManager.createNamedQuery(Showing.FIND_BY_EXPERIENCE, Showing.class);
		query.setParameter("experience", experience);
		return query.getResultList();
	}

	@Override
	public List<Showing> byAccessibility(String accessability) {
		TypedQuery<Showing> query = entityManager.createNamedQuery(Showing.FIND_BY_ACCESSABILITY, Showing.class);
		query.setParameter("accessability", accessability);
		return query.getResultList();
	}

}
