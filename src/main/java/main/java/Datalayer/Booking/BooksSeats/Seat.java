/*//
 * Created by Martyn Green
*/

package main.java.Datalayer.Booking.BooksSeats;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "seats")
public class Seat {
	@NotNull
	@Id
	@Column(name = "seat" , nullable = false, unique = true)
	private String seat;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "screen_ScreenID", nullable = false)
	private int screenid;
	@NotNull
	@Column(name = "type")
	private String type;

	public Seat() {
	}

	public Seat(String seat, int Screenid, String type) {
		super();
		this.seat = seat;
		this.screenid = Screenid;
		this.type = type;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getScreenid() {
		return screenid;
	}

	public void setScreenid(int Screenid) {
		this.screenid = Screenid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
