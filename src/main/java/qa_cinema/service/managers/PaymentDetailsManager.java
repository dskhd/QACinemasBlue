package qa_cinema.service.managers;

import qa_cinema.data.booking.Payment;

public interface PaymentDetailsManager {
	
	Payment persistPaymentDetails(Payment payDetails);
	
	Payment createPaymentDetails(Payment payDetails);
	Payment createEmailAddress(Payment payDetails); // create email if checking out not as a member? - Inside brackets correct?
	
	Payment updatePaymentDetails(Payment payDetails); // update everything
	Payment updatePaymentMethod(Payment payDetails);
	Payment updateCardDetails(Payment payDetails); 
	Payment updateEmailAddress(Payment payDetails); // Update email address associated with the payment - receipts to be emailed
	
	Payment deletePaymentDetails(Payment payDetails); 
	Payment deleteCardDetails(Payment payDetials); 
	

}
