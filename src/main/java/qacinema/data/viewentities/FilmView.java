package qacinema.data.viewentities;

import javax.persistence.Column;

import qacinema.data.film.Classification;

public class FilmView {

	@Column
	String title;
	
	@Column
	String description;
	
	@Column
	int length;
	
	@Column 
	String filmID;

	@Column 
	String classificationID;
	
	@Column 
	Classification classificationType; //yes? no? String?

	@Column 
	String classificationDescription;

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
