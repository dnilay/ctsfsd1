package comm.example.spring.model;

import java.io.Serializable;

public class League implements Serializable{

	private static final long serialVersionUID = -8144326278648299412L;
	private String title;
	private String year;
	private String season;
	public League() {
		super();
	}
	public League(String title, String year, String season) {
		super();
		this.title = title;
		this.year = year;
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
