
package qacinema.data.viewentities;

import javax.persistence.*;

//findFilmsByActor
//findActorsByFilmTitle
@Entity
@Table
@NamedQueries({ @NamedQuery(name = "rolesView.findFilmsByActor",
query = "SELECT s FROM rolesView where rolesView.Actor = :actor"),
	@NamedQuery(name = "rolesView.findActorsByFilmTitle", query = "SELECT s FROM rolesView where rolesView.Film = :film") })
public class RolesView {
	@Column
	private String title;
	@Column
	private String filmID;
	@Column
	private String actorName;
	@Column
	private String role;
	
	public static final String	FIND_BY_ACTOR =	"rolesView.findActorsByFilmTitle";
	public static final String FIND_BY_FILM =	"rolesView.findFilmsByActor";


	public RolesView(String title, String filmID, String actorName, String role) {
		super();
		this.title = title;
		this.filmID = filmID;
		this.actorName = actorName;
		this.role = role;
	}

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
