package application.core.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import application.core.ws.Movie;

public class ClientXML {
	XStream xstream = new XStream();
	
	@XStreamImplicit(itemFieldName = "Movie")
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	public ArrayList<Movie> receiveXML(InputStream movieListXML){
		
		xstream.alias("Movie", Movie.class);
		
		return movieList = (ArrayList<Movie>) xstream.fromXML(movieListXML);
	}
	
}
