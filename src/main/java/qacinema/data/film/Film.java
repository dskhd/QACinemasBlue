/*Author: Sam Jackson
 * 
 */

package qacinema.data.film;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.*;

import qacinema.data.users.UserRating;

@Entity
@Table(name = "film")
//@NamedQueries({ @NamedQuery(query = "SELECT fi FROM FilmView fi WHERE fi.name = :name", name = "Film.FIND_BY_NAME"),
//		@NamedQuery(name = "Film.FIND_ALL", query = "SELECT fi FROM Film fi"), })

public class Film {
	
	public static final String FIND_BY_NAME = "Film.findByName";
	public static final String FIND_ALL = "Film.findAll";

	@NotNull
	@Id
	@Column(name = "FilmID", nullable = false, unique = true)
	private String filmId;

	@NotNull
	@Column(name = "Title", length = 255, nullable = false)
	private String title;

	@NotNull
	@Column(name = "Length", nullable = false)
	private int lengthMins;

	@NotNull
	@Column(name = "Description", nullable = false)
	private String description;

	@NotNull
	@Column(name = "Release_Date", nullable = false)
	private String date;

	@NotNull
	@Column(name = "Classification", nullable = false)
	@Enumerated(EnumType.STRING)
	private Classification classification;

	@OneToMany(mappedBy = "film")
	private List<UserRating> ratings = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "film_has_genres", joinColumns = @JoinColumn(name = "film_FilmID"), inverseJoinColumns = @JoinColumn(name = "genres_GenreID"))
	private List<Genre> genres = new ArrayList<>();

	@OneToMany
	private List<Media> media = new ArrayList<>();

	// TODO Need to check with James, this is a one to Many relationship.
	private List<Role> roles = new ArrayList<>();

	public Film() {
	}

	public Film(String title, int lengthMins, String description, String date) {
		this.title = title;
		this.lengthMins = lengthMins;
		this.description = description;
		this.date = date;
	}

	public String getFilmId() {
		return filmId;
	}

	public void setFilmId(String filmId) {
		this.filmId = filmId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classi) {
		this.classification = classi;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

	public List<UserRating> getRatings() {
		return ratings;
	}

	public void setRatings(List<UserRating> ratings) {
		this.ratings = ratings;
	}

	public void addRating(UserRating rating) {
		this.ratings.add(rating);
	}

	public void addMedia(Media media) {
		this.media.add(media);
	}

}
