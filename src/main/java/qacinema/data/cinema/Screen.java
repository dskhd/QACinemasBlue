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
	private int screenID;
	@NotNull
	@Column(name = "MaxRows")
	private char maxRows;
	@NotNull
	@Column(name = "MaxCols")
	private int maxCols;
	@NotNull
	@Column (name = "ScreenType")
	private String screenType;

	
	private List<Seat> seats;
	
	
	public Screen() {
	}


	public Screen(int screenID, char maxRows, int maxCols, String screenType, List<Seat> seats) {
		super();
		this.screenID = screenID;
		this.maxRows = maxRows;
		this.maxCols = maxCols;
		this.screenType = screenType;
		this.seats = seats;
	}


	public int getScreenID() {
		return screenID;
	}


	public void setScreenID(int screenID) {
		this.screenID = screenID;
	}


	public int getMaxRows() {
		return maxRows;
	}


	public void setMaxRows(char maxRows) {
		this.maxRows = maxRows;
	}


	public int getMaxCols() {
		return maxCols;
	}


	public void setMaxCols(int maxCols) {
		this.maxCols = maxCols;
	}


	public String getScreenType() {
		return screenType;
	}


	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}


	public List<Seat> getSeats() {
		return seats;
	}


	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	

	
}
