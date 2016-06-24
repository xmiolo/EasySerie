package application.core.xml;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import application.core.ws.Movie;
import application.core.ws.Root;

public class ClientXML {
	
	XStream xstream;
	private Root movieList;
	
	
	
	public ClientXML() {
		movieList = new Root();
		xstream = new XStream();
	}



	public Root receiveXML(InputStream movieListXML){
		
		xstream.processAnnotations(Root.class);
		xstream.processAnnotations(Movie.class);
		return movieList = (Root) xstream.fromXML(movieListXML);
	}
	
}
