package qacinema.data.viewentities;

/*
 * Created by Sam Jarvis
 * Edited, updated by James Lamkin
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;


@Entity @Table(name = "showingView")
@Immutable
@NamedQueries({
	@NamedQuery(name="ShowingView.FIND_BY_DATE_TIME",
			query ="SELECT s FROM ShowingView s WHERE s.showTime = :dateTime"),
	
	@NamedQuery(name = "ShowingView.FIND_ALL",
			query = "SELECT s FROM ShowingView s"),
	
	@NamedQuery(name = "ShowingView.FIND_BY_CLASSIFICATION",
			query = "SELECT s FROM ShowingView s WHERE s.classification = :classification"),
	
	//@NamedQuery(name = "ShowingView.FIND_BY_ACCESSIBILITY",
	//		query = "SELECT s FROM ShowingView s WHERE s.accessibility = :accessibility")
})

public class ShowingView {
	
	public static final String FIND_BY_DATE_TIME = "ShowingView.findByTime";
	public static final String FIND_ALL = "ShowingView.findAll";
	public static final String FIND_BY_CLASSIFICATION = "ShowingView.findByClassification";
	public static final String FIND_BY_ACCESSIBILITY = "ShowingView.findByAccessibility";
	
	@Id
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
	private String classification; //String.
	
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

	public String getClassification() {
		return classification;
	}

	public String getClassificationDescription() {
		return classificationDescription;
	}
	

}
