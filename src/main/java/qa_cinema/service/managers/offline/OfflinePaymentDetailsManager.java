/**
 * Authoer: Adam
 */

package qa_cinema.service.managers.offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import qa_cinema.data.booking.Booking;
import qa_cinema.data.booking.Payment;
import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.users.User;
import qa_cinema.service.managers.PaymentDetailsManager;
import qa_cinema.test_data.TestData;

public class OfflinePaymentDetailsManager implements PaymentDetailsManager {

	@Inject private TestData testData;
	
	@Override
	public Payment persistPaymentDetails(Payment payDetails) {
		int id = testData.getPaymentMap().size();
		payDetails.set
		return payDetails;
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
		List<Payment> payment = new ArrayList<>();
		for(Booking booking : testData.getBookingMap().values()) {
			if(booking.getUser() == user) {
				payment.add(booking.getPaymentsid());
			}
		}
		return payment;
	}

	@Override
	public List<Payment> findAllUserPayDetails(Payment payDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
