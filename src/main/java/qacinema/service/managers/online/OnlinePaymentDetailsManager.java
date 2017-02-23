/**
 * Author: Adam
 */

package qacinema.service.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import qacinema.annotations.Loggable;
import qacinema.data.booking.Payment;
import qacinema.data.users.User;
import qacinema.service.managers.PaymentDetailsManager;


@Alternative
@Stateless
@Loggable
public class OnlinePaymentDetailsManager implements PaymentDetailsManager {

	@Inject PaymentDetailsManager pdm;
	
	@Override
	public Payment persistPaymentDetails(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePaymentDetails(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePaymentMethod(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment deletePaymentDetails(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment deleteCardDetails(String cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findUsersPaymentDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findAllUserPayDetails(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
