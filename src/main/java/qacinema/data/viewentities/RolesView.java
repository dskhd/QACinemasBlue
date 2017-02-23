package qacinema.data.viewentities;

import javax.persistence.Column;

public class RolesView {

	@Column 
	String title;

	@Column 
	String filmID;

	@Column 
	String actorName;
	
	@Column 
	String role;

	public String getTitle() {
		return title;
	}

	public String getFilmID() {
		return filmID;
	}

	public String getActorName() {
		return actorName;
	}

	public String getRole() {
		return role;
	}

}
