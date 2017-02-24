/**
 *  Author: Adam
 */

package qacinema.service.managers;

import java.util.List;

import qacinema.data.booking.Payment;
import qacinema.data.users.User;

public interface PaymentDetailsManager {

	public Payment persistPaymentDetails(Payment paymentDetails);
	
	public Payment findUserPaymentDetailsByID(User user, String paymentId);
	public Payment findUserpaymentDetailsViaBooking(User user); 
	public List<Payment> findAllUserPaymentDetails(User user);

	public Payment updatePaymentDetails(Payment paymentDetails); 																
	public Payment updatePaymentMethod(Payment paymentDetails);
																
	public Payment deletePaymentDetails(Payment paymentDetails);
	public Payment deleteCardDetails(String cardNumber);
	
}

