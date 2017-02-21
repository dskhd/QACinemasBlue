package BS.QACinema.dataLayer.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity @Table
public class Genre {

	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable =false, unique = true)
	private String id;
	
	@NotNull
	@Column(length = 50, nullable = false)
	private String genre;
	
	
	public String getId() {
		return id;
	}

	public Genre(String genre){
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
