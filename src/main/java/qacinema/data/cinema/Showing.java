
package qacinema.data.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import qacinema.data.cinema.Screen;
import qacinema.data.film.Film;;

/*
 * Created by James Lamkin
 */
@Entity
@Table(name = "Showing")
public class Showing {
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "showingID", nullable = false, unique = true)
	private String showingID;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "Film_FilmID", nullable = false, unique = true)
	private Film film;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "screen_ScreenID", nullable = false)
	private Screen screen;
	@NotNull
	@Column(name = "Time")
	@Temporal(TemporalType.DATE)
	private String dateTime;
	@NotNull
	@Column(name = "Experience", length = 45)
	private String experience;
	@NotNull
	@Column(name = "Accessability", length = 45)
	private String accessability;

	public Showing() {
		// No-argument constructor for injection
	}

	// Overloading
	public Showing(String showingID, Film film, Screen screen, String dateTime, String experience, String accessability) {
		this.showingID = showingID;
		this.film = film;
		this.screen = screen;
		this.dateTime = dateTime;
		this.experience = experience;
		this.accessability = accessability;
	}

	public String getShowingID() {
		return showingID;
	}

	public void setShowingID(String showingID) {
		this.showingID = showingID;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAccessability() {
		return accessability;
	}

	public void setAccessability(String accessability) {
		this.accessability = accessability;
	}
}
