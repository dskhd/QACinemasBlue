/**
 * Author: Adam
 */

package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import qacinema.annotations.Loggable;
import qacinema.data.booking.Payment;
import qacinema.data.users.User;
import qacinema.service.managers.PaymentDetailsManager;


@Alternative
@Stateless
@Loggable
@Transactional(rollbackOn=Exception.class)

public class OnlinePaymentDetailsManager implements PaymentDetailsManager {
	
	@PersistenceContext(unitName="onlinePayDetailManagerPU")
	
	private EntityManager entityManager;
	
	@Inject PaymentDetailsManager pdm;

	
	//@Override
	public List<Payment> findByPaymentID(String name) {
		TypedQuery<Payment> query = entityManager.createNamedQuery(Payment.FIND_BY_PAYMENT_ID, Payment.class);
		query.setParameter("name", name);
		return query.getResultList();
	}
		
	@Override
	public Payment persistPaymentDetails(Payment paymentDetails) {
		entityManager.getTransaction().begin();
		entityManager.persist(paymentDetails);
		entityManager.getTransaction().commit();
		return findByPaymentID(paymentDetails.getPaymentsid()).get(0);
	}

	@Override
	public Payment findUserPaymentDetailsByPaymentID(User user, String paymentId) {
		return null;
	}

	@Override
	public Payment findUserpaymentDetailsViaBookingID(User user, String bookingID) {
		return null;
	}

	@Override
	public List<Payment> findAllUserPaymentDetails(User user) {
		return null;
	}

	@Override
	public Payment updatePaymentDetails(Payment paymentDetails) {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public Payment updatePaymentMethod(Payment paymentMethod) {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public void deletePaymentDetails(Payment paymentDetails) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteCardDetails(String cardNumber) {
		// TODO Auto-generated method stub
	}

}
