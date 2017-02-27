/**
 *  Author: Adam
 */

package qacinema.service.managers;

import java.util.List;

import qacinema.data.booking.Payment;
import qacinema.data.users.User;

public interface PaymentDetailsManager {

	public Payment persistPaymentDetails(Payment paymentDetails);
	
	public Payment findUserPaymentDetailsByPaymentID(User user, String paymentId);
	public Payment findUserpaymentDetailsViaBookingID(User user, String bookingID); 
	public List<Payment> findAllUserPaymentDetails(User user);

	public Payment updatePaymentDetails(Payment paymentDetails); 																
	public Payment updatePaymentMethod(Payment paymentMethod);
																
	public void deletePaymentDetails(Payment paymentDetails);
	public void deleteCardDetails(String cardNumber);
	
}

