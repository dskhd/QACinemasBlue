package qacinema.data.viewentities;

import javax.persistence.Column;

public class RolesView {

	@Column 
	private String title;

	@Column 
	private String filmID;

	@Column 
	private String actorName;
	
	@Column 
	private String role;

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
