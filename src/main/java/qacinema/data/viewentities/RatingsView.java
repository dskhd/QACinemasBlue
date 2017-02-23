package qacinema.data.viewentities;

import javax.persistence.Column;

public class RatingsView {
	
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
	
	@Column 
	private String ratingID;

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
