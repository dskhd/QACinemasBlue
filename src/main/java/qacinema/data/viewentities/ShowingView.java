package qacinema.data.viewentities;

import javax.persistence.Column;

import qacinema.data.film.Classification;

public class ShowingView {
	
	@Column 
	private String showingID;
	
	@Column 
	private String showTime;
	
	@Column 
	private String screenId;
	
	@Column 
	private String title;
	
	@Column 
	private int length;
	
	@Column 
	private Classification classificationType; //yes? no? String?
	
	@Column 
	private String classificationDescription;

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
