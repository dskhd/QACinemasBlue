/*//
 * Created by Martyn Green
*/

package qa_cinema.data.cinema;


import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "screen")
public class Screen {
	@NotNull
	@Id
	@Column(name = "ScreenID" , nullable = false, unique = true)
	private int screenID;
	@NotNull
	@Column(name = "Capacity")
	private int capacity;
	@NotNull
	@Column (name = "ScreenType")
	private String screenType;

	
	private List<Seat> Seats;
	
	
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

	public List<Seat> getSeat() {
		return Seats;
	}

	
}
