/*//
 * Created by Martyn Green
*/

package BS.QACinema.dataLayer.BooksSeats;

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
	@Column(name = "type")
	private String type;

	public Seat() {
	}

	public Seat(String seat,  String type) {
		super();
		this.seat = seat;
		
		this.type = type;
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
