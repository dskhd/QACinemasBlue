package BS.QACinema.dataLayer.users;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

public class UserRating {

	private String userRating;
	private String rating;
	private String comment;
	
	
	


	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_email")	
	private User reviewer;
	
	
	List<Film> films;
	
	public UserRating() {
		super();
	}
	
	
	public UserRating(String userRating, String rating, String comment, User reviewer, List<Film> films) {
		super();
		this.userRating = userRating;
		this.rating = rating;
		this.comment = comment;
		this.reviewer = reviewer;
		this.films = films;
	}


	public String getUserRating() {
		return userRating;
	}
	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}


	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public User getReviewer() {
		return reviewer;
	}
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}


	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	
	
	
}
