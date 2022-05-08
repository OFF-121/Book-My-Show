package movie;

import java.util.*;

import account.Properties;
import screen.Screen;



public class MovieList {

	private static ArrayList<Movie> movieList=new ArrayList<>();
	
	public MovieList() {
		new Video();
	}
	
	public static ArrayList<Movie> getMovieList(){
		return movieList;
	}
	

	
}
