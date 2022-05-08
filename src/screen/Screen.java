package screen;

import movie.Movie;
import movie.MovieList;

public class Screen {


	private String theatreName;
	private String screenName;
	private String screenType;
	private String conditioner;
	private String audio;
	private String sizeRatio;
	private Movie movie;
	private ListOfSeat seatList ;
	
	
	public String getScreenName() {
		return this.screenName;
	}
	public String getScreenType() {
		return this.screenType;
	}
	public Movie getMovie() {
		return movie;
	}
	public String getConditioner() {
		return this.conditioner;
	}
	public String getAudio() {
		return this.audio;
	}
	public String getSizeRatio() {
		return this.sizeRatio;
	}
	public ListOfSeat getSeatList() {
		return seatList;
	}
    public void setScreenName(String screenName) {	
		this.screenName = screenName;		
	}	
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public void setConditioner(String conditioner) {
		this.conditioner = conditioner;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public void setSizeRatio(String sizeRatio) {
		this.sizeRatio = sizeRatio;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public void setSeatList(ListOfSeat seatList) {
		this.seatList = seatList;
	}
	
	
	public Screen(int idx,String ScreenName, String screenType, String conditioner, String audio, String sizeRatio,String TheatreName)
	{
		setScreenName(ScreenName);
		setScreenType(screenType);
		setConditioner(conditioner);
		setAudio(audio);
		setSizeRatio(sizeRatio);
		
		this.screenName=getScreenName();
		this.screenType=getScreenType();
		this.conditioner=getConditioner();
		this.audio=getAudio();
		this.sizeRatio=getSizeRatio();
		this.theatreName=TheatreName;
		this.movie=MovieList.getMovieList().get(idx%(MovieList.getMovieList().size()));
		this.seatList=new ListOfSeat(80);
	}
	
	public String toString() {
		return 
				"-----------------------------------------"+theatreName+"-----------------------------------------\n"+
				"Screen " + screenName
				+"\n--------------\n"
				+ this.movie+
				"ScreenType  = " + screenType + 
				", \nConditioner  = " + conditioner+
				" \nAudio            = " + audio +
				"\nSizeRatio      =  " + sizeRatio+"\n";
				
	}
}
