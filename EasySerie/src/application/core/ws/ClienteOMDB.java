package application.core.ws;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ClienteOMDB {
	private static final String URL_WEBSERVICE = 
			"http://http://www.omdbapi.com/?";
	/**
	 * OMDB
	 * Modelo de resposta XML
	 * 
	 * <root response="True">
	 * <Movie Title="Masters of Sex" Year="2013–" imdbID="tt2137109" Type="series"/>
	 * </root>
	 * @throws IOException 
	 */
	
	public List<Movie> requestMovieList(String title, String year) throws IOException{
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		URL url = new URL(URL_WEBSERVICE+"s="+title+"r=xml"+"y="+year);
		//Consulta WS
		HttpURLConnection connection = null;
		connection = (HttpURLConnection) url.openConnection();
		InputStream content = connection.getInputStream();
	
		return movieList;
	}
}
