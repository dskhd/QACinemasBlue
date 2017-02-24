
package qacinema.service.managers.offline;

import java.util.Map;
import java.util.Map.Entry;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import qacinema.data.booking.tickets.Ticket;
import qacinema.data.cinema.Seat;
import qacinema.data.cinema.Showing;
import qacinema.service.managers.SeatManager;
import qacinema.testdata.TestData;

@Stateless
public class OfflineSeatManager implements SeatManager {
	@Inject
	TestData testData;

	@Override
	public Map<Seat, Boolean> fildAllSeats(Showing showing) {
		Map<Seat, Boolean> seats = null;
		seats = showing.getScreen().getSeats();
		Map<Integer, Ticket> ticketList = testData.getTicketMap();
		for (Ticket ticketInMap : ticketList.values()) {
			if (ticketInMap.getShowing().equals(showing)) {
				seats.put(ticketInMap.getSeat(), true);
			}
		}
		return seats;
	}

	@Override
	public Seat findFirstFreeSeat(Showing showing) throws NoResultException {
		Map<Seat, Boolean> seats = fildAllSeats(showing);
		for (Entry<Seat, Boolean> seatFromList : seats.entrySet()) {
			if (seatFromList.getValue() == false) {
				return seatFromList.getKey();
			}
		}
		
		throw new NoResultException("No Seats found.");
	}

	
	
	
}
