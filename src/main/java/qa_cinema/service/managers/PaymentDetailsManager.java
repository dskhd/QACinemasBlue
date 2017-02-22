/**
 *  Author: Adam
 */

package qa_cinema.service.managers;

import java.util.List;

import qa_cinema.data.booking.Payment;
import qa_cinema.data.users.User;

public interface PaymentDetailsManager {

	public Payment persistPaymentDetails(Payment payDetails);

	public Payment updatePaymentDetails(Payment payDetails); 																
	public Payment updatePaymentMethod(Payment payDetails);
																
	public Payment deletePaymentDetails(Payment payDetails);
	public Payment deleteCardDetails(String cardNumber);
	
	public List<Payment> findUsersPaymentDetails(User user); // or (String name) ?
	public List<Payment> findAllUserPayDetails(Payment payDetails);
	
}

