
package qacinema.data.viewentities;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

//findFilmsByActor
//findActorsByFilmTitle
@Entity
@Immutable
@Table
@NamedQueries({ @NamedQuery(name = "rolesView.findFilmsByActor",
						query = "SELECT r FROM RolesView r where r.actorName = :actor"),
				@NamedQuery(name = "rolesView.findActorsByFilmTitle", query = "SELECT r FROM RolesView r where r.filmId = :film") 
})
public class RolesView {
	
	@Id
	@Column
	private String role;
	@Column
	private String title;
	@Column
	private String filmId;
	@Column
	private String actorName;
	
	public static final String FIND_BY_ACTOR =	"rolesView.findActorsByFilmTitle";
	public static final String FIND_BY_FILM =	"rolesView.findFilmsByActor";

	

	public String getTitle() {
		return title;
	}

	public String getFilmId() {
		return filmId;
	}

	public String getActorName() {
		return actorName;
	}

	public String getRole() {
		return role;
	}
}
