/**
 *  Author: Adam
 */

package qacinema.service.managers;

import java.util.List;

import qacinema.data.booking.Payment;
import qacinema.data.users.User;

public interface PaymentDetailsManager {

	public Payment persistPaymentDetails(Payment payDetails);

	public Payment updatePaymentDetails(Payment payDetails); 																
	public Payment updatePaymentMethod(Payment payDetails);
																
	public Payment deletePaymentDetails(Payment payDetails);
	public Payment deleteCardDetails(String cardNumber);
	
	public List<Payment> findUsersPaymentDetails(User user); // or (String name) ?
	public List<Payment> findAllUserPayDetails(Payment payDetails);
	
}

