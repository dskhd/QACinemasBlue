/**
 * Authoer: Adam
 * Editor Matt Gordon
 */

package qacinema.service.managers.offline;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import qacinema.data.booking.Booking;
import qacinema.data.booking.Payment;
import qacinema.data.users.User;
import qacinema.service.managers.PaymentDetailsManager;
import qacinema.testdata.TestData;

public class OfflinePaymentDetailsManager implements PaymentDetailsManager {

	@Inject
	private TestData testData;

	@Override
	public Payment persistPaymentDetails(Payment paymentDetails) {
		testData.addPayment(paymentDetails);
		return testData.getPaymentMap().get(paymentDetails.hashCode());
	}

	@Override
	public Payment findUserPaymentDetailsByPaymentID(User user, String paymentId) throws NoResultException {
		for (Payment paymentDetails : user.getPayments()) {
			if (paymentDetails.getPaymentsid().equals(paymentId)) {
				return paymentDetails;
			}
		}
		throw new NoResultException("No Payment Details Found");
	}

	@Override
	public Payment findUserpaymentDetailsViaBookingID(User user, String bookingID) throws NoResultException {
		for (Booking booking : testData.getBookingMap().values()) {
			if (booking.getUser().getEmail().equals(user.getEmail())) {
				return booking.getPayment();
			}
		}
		throw new NoResultException("No Payment Details Found");
	}

	@Override
	public List<Payment> findAllUserPaymentDetails(User user) {
		return user.getPayments();
	}

	@Override
	public Payment updatePaymentDetails(Payment paymentDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePaymentMethod(Payment paymentDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCardDetails(String cardNumber) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void deletePaymentDetails(Payment paymentDetails) {
		// TODO Auto-generated method stub
		return;
	}

}
