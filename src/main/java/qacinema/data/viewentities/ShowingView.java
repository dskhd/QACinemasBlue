package qacinema.data.viewentities;

import javax.persistence.Column;

import qacinema.data.film.Classification;

public class ShowingView {
	
	@Column 
	String showingID;
	
	@Column 
	String showTime;
	
	@Column 
	String screenId;
	
	@Column 
	String title;
	
	@Column 
	int length;
	
	@Column 
	Classification classificationType; //yes? no? String?
	
	@Column 
	String classificationDescription;

	public String getShowingID() {
		return showingID;
	}

	public String getShowTime() {
		return showTime;
	}

	public String getScreenId() {
		return screenId;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Classification getClassificationType() {
		return classificationType;
	}

	public String getClassificationDescription() {
		return classificationDescription;
	}
	

}
