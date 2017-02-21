package BS.QACinema.dataLayer.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "films")
public class Film {

	@NotNull
	@Id
	@Column(name = "FilmID", nullable = false, unique = true)
	private int filmId;
	
	@NotNull
	@Column(name = "Title", length = 255, nullable = false)
	private String title;
	
	@NotNull
	@Column(name = "Length", nullable = false)
	private int lengthMins;
	
	@NotNull
	@Column(name = "Description",  nullable = false)
	private String description;
	
	@NotNull
	@Column(name = "Release_Date",  nullable = false)
	private int date;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ClassificationID", nullable = false)
	private String classification;

	public Film(String title, int lengthMins, String description, int date) {
		super();
		this.title = title;
		this.lengthMins = lengthMins;
		this.description = description;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLengthMins() {
		return lengthMins;
	}

	public void setLengthMins(int lengthMins) {
		this.lengthMins = lengthMins;
	}

	public String getDescirption() {
		return description;
	}

	public void setDescirption(String descirption) {
		this.description = descirption;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public String getClassification(){
		return classification;
	}

}
