/*//
 * Created by Martyn Green
*/

package main.java.Datalayer.Booking.BooksSteats;

import com.sun.istack.internal.NotNull;

public class Seat {
	@NotNull
	private int ScreenID;
	@NotNull
	private String seat;
	@NotNull
	private String type;

	public Seat() {
	}

	public Seat(int screenID, String seat, String type) {
		super();
		ScreenID = screenID;
		this.seat = seat;
		this.type = type;
	}

	public int getScreenID() {
		return ScreenID;
	}

	public void setScreenID(int screenID) {
		ScreenID = screenID;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
