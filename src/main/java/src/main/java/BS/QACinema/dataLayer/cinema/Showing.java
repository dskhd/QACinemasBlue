package src.main.java.BS.QACinema.dataLayer.cinema;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
	private int filmID;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "screen_ScreenID", nullable=false)
	private int screen_ScreenID;
	
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
	public Showing(int filmID, int screenID, String dateTime,  String experience, String accessability){
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
	
	public int getFilm() {
		return filmID;
	}

	public void setFilm(int film) {
		this.filmID = film;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getScreen() {
		return screen_ScreenID;
	}

	public void setScreen(int screen) {
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
