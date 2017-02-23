/*//
 * Created by Martyn Green
*/

package qacinema.data.cinema;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "screen")
public class Screen {
	@NotNull
	@Id
	@Column(name = "screenID", nullable = false, unique = true)
	private String screenID;
	@NotNull
	@Column(name = "maxRows")
	private char maxRows;
	@NotNull
	@Column(name = "maxCols")
	private int maxCols;
	@NotNull
	@Column(name = "screenType")
	private String screenType;
	private Map<Seat, Boolean> seats = new HashMap<>();

	public Screen() {
	}

	public Screen(String screenID, char maxRows, int maxCols, String screenType) {
		super();
		this.screenID = screenID;
		this.maxRows = maxRows;
		this.maxCols = maxCols;
		this.screenType = screenType;
		createSeatsList();
	}

	private void createSeatsList() {
		for (char ch = 'A'; ch <= maxRows; ch++) {
			for (int i = 1; i <= maxCols; i++) {
				Seat aSeat = new Seat("" + ch + i, "Regular");
				seats.put(aSeat, false);
			}
		}
	}

	public String getScreenID() {
		return screenID;
	}


	public int getMaxRows() {
		return maxRows;
	}


	public int getMaxCols() {
		return maxCols;
	}


	public String getScreenType() {
		return screenType;
	}

	
	public Map<Seat, Boolean> getSeats() {
		return new HashMap<Seat, Boolean>(seats);
	}

}
