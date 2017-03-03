package qacinema.data.viewentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import qacinema.data.film.Classification;

@Entity @Table(name="filmView")
public class FilmView {

	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private int length;
	
	@Column 
	private String filmID;

	@Column 
	private String classificationID;
	
	@Column 
	private Classification classificationType; //yes? no? String?

	@Column 
	private String classificationDescription;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getLength() {
		return length;
	}

	public String getFilmID() {
		return filmID;
	}

	public String getClassificationID() {
		return classificationID;
	}

	public Classification getClassificationType() {
		return classificationType;
	}

	public String getClassificationDescription() {
		return classificationDescription;
	}
}
