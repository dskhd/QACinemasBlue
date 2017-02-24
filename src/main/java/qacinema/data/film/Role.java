/*Author Sam Jackson
 * 
 */

package qacinema.data.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "roles")
@NamedQueries({ @NamedQuery(query = "SELECT r FROM roleview r WHERE r.name = :name", name = "Role.FIND_BY_NAME"),
	@NamedQuery(name = "Role.FIND_ALL", query = "SELECT r FROM roles r"), })
public class Role {

	@Id
	@NotNull
	@Column(name = "role", length = 225, nullable = false)
	private String role;
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(name = "actors_ActorsID", nullable = false)
	private Actor actor;
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(name = "film_FilmID", nullable = false)
	private Film FilmId;

	public Role() {}

	public Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Film getFilmId() {
		return FilmId;
	}

	public void setFilmId(Film filmId) {
		FilmId = filmId;
	}
	
	
	
	

}
