package movie;

public class Movie {

	private String id;
    private String movieId;
	private String movieName;
	private String lang;
	private String releaseDate;
	private String duration;
	private String imdb;
	private String type;
	
	public String getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getDuration() {
		return duration;
	}
    public String getLang() {
		return lang;
	}
    public String getReleaseDate() {
		return releaseDate;
	}
	public String getImdb() {
		return imdb;
	}
	public String getType() {
		return type;
	}
	
	
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	
	public Movie(String movieName, String lang, String duration, String date, String imdb, String type) {
		setMovieName(movieName);
    	setLang(lang);
		setDuration(duration);
		setReleaseDate(date);
		setImdb(imdb);
		setType(type);
		
		this.movieId=getMovieId();
		this.movieName=getMovieName();
		this.lang=getLang();
		this.duration=getDuration();
		this.releaseDate=getReleaseDate();
		this.imdb=getImdb();
		this.type=getType();
		
	}
	
	@Override
	public String toString() {
		return "MovieName   = " + movieName 
				+ " \nLanguage      = " + lang 
				+ "\nDuration        = " + duration 
				+ "\nIMDB             = " + imdb 
				+ "\nReleaseDate= "+ releaseDate 
				+ "\nType             = " + type +"\n\n";
	}

}
