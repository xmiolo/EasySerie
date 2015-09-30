package application.core.ws;

import com.thoughtworks.xstream.annotations.XStreamAlias;


public class Movie {
	//<Movie Title="Masters of Sex" Year="2013–" imdbID="tt2137109" Type="series"/>
	private String Title;
	private String Year;
	private String imdbID;
	
	
	public Movie() {
	}
	
	public Movie(String title, String year, String imdbID) {
		this.Title = title;
		this.Year = year;
		this.imdbID = imdbID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		imdbID = imdbID;
	}



	@Override
	public String toString() {
		return "Movie [Title=" + Title + ", Year=" + Year + ", imdbID=" + imdbID +"]";
	}

	
}
