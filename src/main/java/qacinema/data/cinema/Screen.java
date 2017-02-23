/*//
 * Created by Martyn Green
*/

package qacinema.data.cinema;


import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "screen")
public class Screen {
	@NotNull
	@Id
	@Column(name = "ScreenID" , nullable = false, unique = true)
	private String screenID;
	@NotNull
	@Column(name = "Capacity")
	private int capacity;
	@NotNull
	@Column (name = "ScreenType")
	private String screenType;

	
	private List<Seat> seats;
	
	
	public Screen() {
	}

	public Screen(String screenID, int capacity, String screenType) {
		super();
		this.screenID = screenID;
		this.capacity = capacity;
		this.screenType = screenType;
	}

	public String getScreenID() {
		return screenID;
	}

	public void setScreenID(String screenID) {
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
		return seats;
	}

	
}
