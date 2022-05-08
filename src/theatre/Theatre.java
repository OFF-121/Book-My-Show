package theatre;

import java.util.*;

import movie.MovieList;
import screen.Screen;




public class Theatre {

	private String name;
	private  List<Screen> screen=new ArrayList<>();
	
	public String getName() {
		return name;
	}
    public  void setName(String name) {
		this.name = name;
	}
    public Screen getScreen(int idx){
    	return screen.get(idx);
    }
    public List<Screen> getScreenList(){
    	return screen;
    }
    
    public Theatre(String name,int n) {
		setName(name);
		this.name=getName();
		new TheatreProperties(n,getName(),this);
	}
	
//	public static void main(String[] args) {
//		new MovieList();
//		new Theatre("Pravin", 5);
//	}
}
