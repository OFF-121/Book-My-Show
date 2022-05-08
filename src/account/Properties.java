package account;

import java.util.*;

import account.Properties;
import movie.Movie;
import movie.MovieList;
import screen.Screen;
import theatre.Theatre;

public class Properties {
    static Theatre t1;
    public static ArrayList<Screen> movieScreen=new ArrayList<>();
	public static HashMap<String,ArrayList<Screen>> connectMovieScreen=new HashMap<>();
    
	
    public Properties() {
    	new Account();
    	t1=new Theatre("MULITIPLEX",5);
	}    
    
    public void addMovieScreenHandler() {
			for(Movie movie:MovieList.getMovieList())
			{
				ArrayList<Screen> x=new ArrayList<>();
				for(Screen screen:Properties.movieScreen)
					if(movie.getMovieName().equals(screen.getMovie().getMovieName())) x.add(screen);					
				Properties.connectMovieScreen.put(movie.getMovieName(), x);
			}
		}
}
