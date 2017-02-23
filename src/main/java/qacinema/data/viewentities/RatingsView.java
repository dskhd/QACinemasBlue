package qacinema.data.viewentities;

import javax.persistence.Column;

public class RatingsView {
	
	@Column 
	String userAlias;
	
	@Column 
	String filmID;
	
	@Column 
	String title;
	
	@Column 
	int rating;
	
	@Column 
	String reviewText;
	
	@Column 
	String email;
	
	@Column 
	String ratingID;

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
