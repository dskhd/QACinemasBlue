package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.booking.tickets.Ticket;
import qacinema.data.film.Film;
import qacinema.data.users.User;
import qacinema.service.managers.TicketManager;


@Alternative
@Stateless
@Loggable
@Transactional(rollbackOn=Exception.class)
public class OnlineTicketManager implements TicketManager {
	
	@PersistenceContext(name="qaCinemaPU")
	private EntityManager entityManager;
	

	@Override
	public Ticket persistTicket(Ticket ticket) {
		entityManager.getTransaction().begin();
		entityManager.persist(ticket);
		entityManager.getTransaction().commit();
		
		return findTicketByID(ticket.getTicketID());
	}

	@Override
	public Ticket findTicketByID(String id) {
		TypedQuery<Ticket> query = entityManager.createNamedQuery(Ticket.FIND_BY_ID, Ticket.class);
		
		return query.getResultList().get(0);
	}

	@Override
	public List<Ticket> getTicketsFromUser(User user) {
		String email = user.getEmail();
		TypedQuery<Ticket> query = entityManager.createNamedQuery(Ticket.FIND_ALL_BY_USER, Ticket.class);
		query.setParameter("userEmail", email);
		
		
		return query.getResultList();
	}

	@Override
	public List<Ticket> getTicketsFromFilm(User user, Film film) {
		List<Ticket> allTickets = getTicketsFromUser(user);
		
		
		
		return null;
	}	
}
