package qa_cinema.service.managers.offline;

import java.util.List;
import java.util.Map;

import qa_cinema.data.booking.tickets.Ticket;
import qa_cinema.data.cinema.Showing;

public class Seats {
	static void setSeatToOccupied(Map<String, Integer> seats, Showing showing, Ticket ticket) {
		if (ticket.getShowing().equals(showing)) {
			seats.put(ticket.getSeat().toString(), 1);
		}
	}

	static void setSeatsForScreenCapacity(Map<String, Integer> seats, Showing showing) {
		for (int x = 0; x < showing.getScreen().getCapacity(); x++) {
			setEmptySeats(seats);
		}
	}

	static  void setEmptySeats(Map<String, Integer> seats) {
		for (char row = 'a'; row < 'z'; row++) {// for each row
			for (int col = 0; col < 41; col++) {// for each seat on row
				String seatname = "" + row + col;// seatname A1,A2...B5...Z41
				seats.put(seatname, 0);
			}
		}
	}
	static boolean checkCurrentSeatIsSameRowAndUnoccupied(String row, Map.Entry<String, Integer> seat) {
		return row.equals(seat.getKey().substring(1)) && seat.getValue() == 0;
	}
	static void getEmptySeatsNextToeachOther(int number_of_seats, Map<String, Integer> seats, List<String> seatsNextToEachOther) {
		int count_of_empty_seats = 0;
		String row = "A";
		String nextToEachOther = "";
		for (Map.Entry<String, Integer> seat : seats.entrySet()) {
			if (Seats.checkCurrentSeatIsSameRowAndUnoccupied(row, seat)) {
				count_of_empty_seats++;
				nextToEachOther += seat.toString() + ",";
			} else {
				count_of_empty_seats = 0;
				nextToEachOther = "";
			}
			if (count_of_empty_seats == number_of_seats) {
				seatsNextToEachOther.add(nextToEachOther);
				count_of_empty_seats = 0;
				nextToEachOther = "";
			}
		}
	}
}
