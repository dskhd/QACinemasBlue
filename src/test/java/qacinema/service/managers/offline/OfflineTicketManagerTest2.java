package qacinema.service.managers.offline;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;


import qacinema.data.booking.tickets.Ticket;
import qacinema.testdata.TestData;

@RunWith(MockitoJUnitRunner.class)
public class OfflineTicketManagerTest2 {
	
	@Mock TestData testData;
	@InjectMocks OfflineTicketManager manager;
	
	private Ticket ticket = new Ticket();
	private Map<Integer, Ticket> tickets = new HashMap<>();

	@Before
	public void setUp()  {
		manager = new OfflineTicketManager();
		manager.setTestData(testData);
		
		ticket.setID("" + ticket.hashCode());
	}

	@Test
	public void testGetByID() {
		tickets.put(ticket.hashCode(), ticket);
		when(testData.getTicketMap()).thenReturn(tickets);
		Assert.assertEquals(manager.findTicketByID("" + ticket.hashCode()), ticket);
	}
	
	@Test
	public void testGetByFilm(){
		
	}

}
