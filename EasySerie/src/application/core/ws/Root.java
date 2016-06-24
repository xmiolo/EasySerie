package application.core.ws;

import java.util.*;

import com.thoughtworks.xstream.annotations.*;

@XStreamAlias("root")
public class Root {
	@XStreamAlias("response")
	private String response;
	
	@XStreamImplicit(itemFieldName="Movie")
	private List<Movie> movies = new ArrayList<Movie>();
	//private Movie movie;
	

	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	/*public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}*/
	
	
}
