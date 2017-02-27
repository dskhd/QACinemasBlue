
package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.viewentities.RolesView;
import qacinema.service.managers.RolesViewManager;

@Alternative
@Stateless
@Loggable
@Transactional(rollbackOn = Exception.class)
public class OnlineRolesViewManager implements RolesViewManager {
	@PersistenceContext(unitName = "QACinemaBluePU")
	private EntityManager entityManager;

	public RolesView persistRolesView(RolesView rolesView) {
		entityManager.getTransaction().begin();
		entityManager.persist(rolesView);
		entityManager.getTransaction().commit();
		return rolesView;
	}

	@Override
	public List<RolesView> findFilmsByActor(String actorName) {
		TypedQuery<RolesView> query = entityManager.createNamedQuery(RolesView.FIND_BY_ACTOR, RolesView.class);
		query.setParameter("actor", actorName);
		return query.getResultList();
	}

	@Override
	public List<RolesView> findActorsByFilmTitle(String filmTitle) {
		TypedQuery<RolesView> query = entityManager.createNamedQuery(RolesView.FIND_BY_FILM, RolesView.class);
		query.setParameter("film", filmTitle);
		return query.getResultList();
	}
}
