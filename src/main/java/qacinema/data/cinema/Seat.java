/*//
 * Created by Martyn Green
*/

package qacinema.data.cinema;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "seats")
public class Seat {
	@NotNull
	@Id
	@Column(name = "seat", nullable = false, unique = true)
	private String seatNum;
	@NotNull
	@Column(name = "type")
	private String type;

	public Seat() {
	}

	public Seat(String seat, String type) {
		super();
		this.seatNum = seat;
		this.type = type;
	}
	

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seat) {
		this.seatNum = seat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
