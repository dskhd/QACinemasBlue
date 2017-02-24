package qacinema.data.film;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity @Table
public class Genre {

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String genreName;
	
	
	public Genre(String genre){
		this.genreName = genre;
	}
	
	public String getGenre() {
		return genreName;
	}

	public void setGenre(String genre) {
		this.genreName = genre;
	}
	
	public int getId(){
		return id;
	}
}
