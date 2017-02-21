package BS.QACinema.dataLayer;


import org.junit.Assert;
import org.junit.Test;

import BS.QACinema.dataLayer.booking.TicketType;

/**
* @author AlexN
*/
public class TicketTypeTest {
	
	@Test
	public void testGetPrice(){
		TicketType child = TicketType.CHILD;
		TicketType adult = TicketType.ADULT;
		TicketType student = TicketType.STUDENT;
		TicketType OAP = TicketType.OAP;
		
		Assert.assertEquals(12.99, adult.getPrice(), 0.001);
		Assert.assertEquals(6.99, child.getPrice(), 0.001);
		Assert.assertEquals(9.99, student.getPrice(), 0.001);
		Assert.assertEquals(7.99, OAP.getPrice(), 0.001);
	}

}
