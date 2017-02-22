package qa_cinema.data.users;
/**
 * Created by Mark Lester
 */



import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import qa_cinema.data.film.Film;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class UserRating {

	@Id
	@Column(name = "user_ratingid")
	private int ratingId;
	
	@NotNull
	@Column(name = "rating")
	private int rating;
	
	@NotNull
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_email")	
	private User reviewer;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="filmId")	
	private Film film;
	
	public UserRating() {
		super();
	}
	
	
	public UserRating(int rating, String comment, User reviewer, Film film) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.reviewer = reviewer;
		this.film = film;
	}


	


	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}


	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
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


	public Film getFilms() {
		return film;
	}
	public void setFilms(Film film) {
		this.film = film;
	}
	
	
	
	
}
