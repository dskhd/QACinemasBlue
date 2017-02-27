package qacinema.data.viewentities;

/*
 * Created by Sam Jarvis
 * Edited, updated by James Lamkin
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity @Table(name = "showingView")
@NamedQueries({
	@NamedQuery(name="ShowingView.FIND_BY_DATE_TIME",
			query ="SELECT s FROM showingView s WHERE s.showTime = :dateTime"),
	@NamedQuery(name = "ShowingView.FIND_ALL",
			query = "SELECT s FROM showingView s"),
	@NamedQuery(name = "ShowingView.FIND_BY_CLASSIFICATION",
			query = "SELECT s FROM shoiwngView s WHERE s.classification = :classification"
				),
	@NamedQuery(name = "ShowingView.FIND_BY_ACCESSIBILITY",
			query = "SELECT s FROM showingView s WHERE s.accessibility = :accessibility"
			)
})

public class ShowingView {
	
	public static final String FIND_BY_DATE_TIME = "ShowingView.findByTime";
	public static final String FIND_ALL = "ShowingView.findAll";
	public static final String FIND_BY_CLASSIFICATION = "ShowingView.findByClassification";
	public static final String FIND_BY_ACCESSIBILITY = "ShowingView.findByAccessibility";
	
	
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
	private String classificationType; //String.
	
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

	public String getClassificationType() {
		return classificationType;
	}

	public String getClassificationDescription() {
		return classificationDescription;
	}
	

}
