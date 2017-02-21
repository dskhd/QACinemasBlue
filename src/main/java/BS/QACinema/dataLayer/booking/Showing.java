package BS.QACinema.dataLayer.booking;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import BS.QACinema.dataLayer.BooksSeats.Screen;
import BS.QACinema.dataLayer.film.Film;

/*
 * Created by James Lamkin
 */

@Entity
@Table(name="Showing")
public class Showing{
	
	@NotNull
	@Id
	@Column(name = "showingID",  nullable = false, unique = true )
	private int showingID;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "Film_FilmID", nullable=false, unique=true)
	private List<Film> filmID;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "screen_ScreenID", nullable=false)
	private List<Screen> screen_ScreenID;
	
	@NotNull
	@Column(name="Time")
	@Temporal(TemporalType.DATE)
	private String dateTime;
	
	@NotNull
	@Column(name = "Experience", length = 45)
	private String experience;
	
	@NotNull
	@Column(name = "Accessability", length = 45) 
	private String accessability;
	
	//no-args constructor
	public Showing() { }
	
	//Overloading
	public Showing(int showingID, List<Film> filmID, List<Screen> screenID, String dateTime,  String experience, String accessability){
		this.showingID = showingID;
		this.filmID = filmID;
		this.screen_ScreenID = screenID;
		this.dateTime = dateTime;
		this.experience = experience;
		this.accessability = accessability;
	}
	
	public int getShowingID() {
		return showingID;
	}

	public void setShowingID(int showingID) {
		this.showingID = showingID;
	}
	
	public List<Film> getFilm() {
		return filmID;
	}

	public void setFilm(List<Film> film) {
		this.filmID = film;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public List<Screen> getScreen() {
		return screen_ScreenID;
	}

	public void setScreen(List<Screen> screen) {
		screen_ScreenID = screen;
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
