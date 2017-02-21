/*//
 * Created by Martyn Green
*/

package main.java.Datalayer.Booking.BooksSteats;

import com.sun.istack.internal.NotNull;

public class Screen {
	@NotNull
	private int screenID;
	@NotNull
	private int capacity;
	@NotNull
	private String screenType;

	public Screen() {
	}

	public Screen(int screenID, int capacity, String screenType) {
		super();
		this.screenID = screenID;
		this.capacity = capacity;
		this.screenType = screenType;
	}

	public int getScreenID() {
		return screenID;
	}

	public void setScreenID(int screenID) {
		this.screenID = screenID;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
}
