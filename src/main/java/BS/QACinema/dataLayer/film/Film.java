package com.QAC.BlueTeam;

import javax.validation.constraints.*;

public class Film {

	@NotNull
	private String title;
	@NotNull
	private int lengthMins;
	@NotNull
	private String descirption;
	@NotNull
	private String date;
	@NotNull
	private String classification;

	public Film(String title, int lengthMins, String descirption, String date, String classification) {
		super();
		this.title = title;
		this.lengthMins = lengthMins;
		this.descirption = descirption;
		this.date = date;
		this.classification = classification;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLengthMins() {
		return lengthMins;
	}

	public void setLengthMins(int lengthMins) {
		this.lengthMins = lengthMins;
	}

	public String getDescirption() {
		return descirption;
	}

	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

}
