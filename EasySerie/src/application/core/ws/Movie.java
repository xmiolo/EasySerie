package application.core.ws;

public class Movie {
	//<Movie Title="Masters of Sex" Year="2013–" imdbID="tt2137109" Type="series"/>
	private String title;
	private String year;
	private String imdbID;
	private String type;
	
	
	public Movie() {
	}
	
	public Movie(String title, String year, String imdbID, String type) {
		this.title = title;
		this.year = year;
		this.imdbID = imdbID;
		this.type = type;
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
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
