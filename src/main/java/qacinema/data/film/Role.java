package qacinema.data.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "roles")
public class Role {

	@NotNull
	@Column(name = "role", length = 225, nullable = false)
	private String role;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "actors_ActorsID", nullable = false)
	private Actor actor;

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
	
	

}
