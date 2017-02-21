package BS.QACinema.dataLayer.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity @Table(name = "Classification")
public enum Classification {
	
	
	CLASS_U("U"), CLASS_PG("PG"), CLASS_12("12"), CLASS_12A("12A"), CLASS_15("15"), CLASS_18("18");
	
	@NotNull
	@Column(nullable = false, length = 3)
	private final String classification;

	private Classification(String classification) {
		this.classification = classification;
	}

	public String getClassification() {
		return this.classification;
	}
}