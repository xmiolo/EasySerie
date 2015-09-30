package application.core.ws;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import application.core.xml.ClientXML;

public class ClienteOMDB {
	private static final String URL_WEBSERVICE = "http:///?";
	private ClientXML clientXML;

	public ClienteOMDB() {
		clientXML = new ClientXML();
	}

	/**
	 * OMDB Modelo de resposta XML
	 * 
	 * <root response="True"> <Movie Title=
	 * "Masters of Sex" Year="2013–" imdbID="tt2137109" Type="series"/> </root>
	 * </root>
	 * @throws IOException
	 */

	public ArrayList<Movie> requestMovieList(String title, String year)  {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		URL url = null;
		InputStream content = null;
		URI uri = null;
		String montaConsulta = "s="+title+"&r=xml&y="+year;
		try {
			uri = new URI("http","www.omdbapi.com",null,montaConsulta,null);
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			url = new URL(uri.toASCIIString());
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(url);
		// Consulta WS
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection)url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			content = connection.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		movieList = clientXML.receiveXML(content);
		return movieList;
	}
}
