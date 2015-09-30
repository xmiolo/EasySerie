package application.core;

import java.io.IOException;

import application.core.ws.ClienteOMDB;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteOMDB c = new ClienteOMDB();
		System.out.println(c.requestMovieList("Masters of Sex", ""));
	}

}
