package movie;

import java.util.*;

public class Video {

	private static ArrayList<String>movies=new ArrayList<>(Arrays.asList("ETERNALS","KGF","MOON KNIGHT","RAGNAROK","BEAST","COME COMINGS"));	
	private static ArrayList<String>Date=new ArrayList<String>(Arrays.asList("12 April 2022","09 Sept 2020","19 June 2020","15 March 2022","29 Jan 2022","20 Dec 2018"));
	private ArrayList<String>bkplang=new ArrayList<>(Arrays.asList("Tamil","English","Hindi","Telugu","Malayalam","Kannada"));
	private ArrayList<String>bkpType=new ArrayList<>(Arrays.asList("Action","Comedy","Drama","Fantasy","Horror","Mystery","Romance","Thriller","Western"));
	
	public Video() {
		for(int i=0;i<movies.size();i++)
		{
		    	ArrayList<String> language=new ArrayList<>(bkplang);
		    	ArrayList<String> movieType=new ArrayList<>(bkpType);
			    String lang="",type="";
		    	int langSize=language.size(),typeSize=movieType.size();
		    	for(int j=0;j<4;j++)
		    	{
		    		int idx1=(int)(Math.random()*(langSize-0)+0);
		    		int idx2=(int)(Math.random()*(typeSize-0)+0);
		    		lang+=language.get(idx1)+"  ";
		    		type+=movieType.get(idx2)+"  ";
		    		
		    		language.remove(language.get(idx1));
		    		movieType.remove(movieType.get(idx2));
		    		langSize--;
		    		typeSize--;		    				    	
		    	}
		    	Float IMDB=new Float(Math.random()*(10-6)+6);
		    	String duration=(int)(Math.random()*(200-150)+150)+"min";
		    	String imdb=(IMDB+"").substring(0,3);
		    	String date=this.Date.get(i);		    	
		    	Movie m=new Movie(movies.get(i),lang,duration,date,imdb,type);
		    	MovieList.getMovieList().add(m);
	    		//System.out.println(m);
		}	
	}

}
