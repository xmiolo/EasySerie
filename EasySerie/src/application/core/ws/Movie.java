package application.core.ws;

import com.thoughtworks.xstream.annotations.XStreamAlias;


public class Movie {
	//<Movie Title="Masters of Sex" Year="2013–" imdbID="tt2137109" Type="series"/>
	@XStreamAlias("Title")
	private String title;
	@XStreamAlias("Year")
	private String year;
	@XStreamAlias("imdbID")
	private String imdbID;
	@XStreamAlias("type")
	private String Type;
	
	
	public Movie() {
	}
	
	public Movie(String title, String year, String imdbID) {
		this.title = title;
		this.year = year;
		this.imdbID = imdbID;
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

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", imdbID=" + imdbID + ", Type=" + Type + "]";
	}
}
