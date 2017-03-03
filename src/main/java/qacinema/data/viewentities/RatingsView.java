package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;


@Entity @Table(name="ratingsView")
@Immutable
public class RatingsView {
	
	
	@Id
	@Column 
	private String ratingID;
	
	@Column 
	private String userAlias;
	
	@Column 
	private String filmID;
	
	@Column 
	private String title;
	
	@Column 
	private int rating;
	
	@Column 
	private String reviewText;
	
	@Column 
	private String email;
	
	

	public String getUserAlias() {
		return userAlias;
	}

	public String getFilmID() {
		return filmID;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public String getEmail() {
		return email;
	}

	public String getRatingID() {
		return ratingID;
	}

}
