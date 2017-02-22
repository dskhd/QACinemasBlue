package qa_cinema.data.users;
/**
 * Created by Mark Lester
 */


import java.util.List;

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
	
	private List<Film> films;
	
	public UserRating() {
		super();
	}
	
	
	public UserRating(int rating, String comment, User reviewer, List<Film> films) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.reviewer = reviewer;
		this.films = films;
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


	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	
	
	
}
