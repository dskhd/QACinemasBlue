package qa_cinema.data.film;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "actors")
public class Actor {

	@NotNull
	@Column(name = "FirstName", length = 225, nullable = false)
	private String firstName;
	
	@Column(name = "LastName", length = 225, nullable = true)
	private String lastName;
	
	//file_roles_FilmRolesID should be ActorID (generically, filmRoles referring to Directors, producers, Actors etc).
	@ManyToMany
	@JoinTable(name = "film_has_actor_roles", joinColumns = @JoinColumn(name = "film_FilmID"), inverseJoinColumns = @JoinColumn(name = "roles_role"))
	private List<Role> roles;

	public Actor(){}
	
	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
