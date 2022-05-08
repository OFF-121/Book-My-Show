package theatre;

import java.util.*;
import java.util.Arrays;
import java.util.List;

import account.Properties;
import screen.Screen;


public class TheatreProperties {

	private int screenId=1;
	private List<String> screenType=new ArrayList<>(Arrays.asList("Curved","Flat"));
	private List<String> conditioner=new ArrayList<>(Arrays.asList("Ac","Non-Ac"));
	private List<String> audioType=new ArrayList<>(Arrays.asList("DolbyCinema","DolbyDigital","DolbySurround","DolbyDigitalSurroundEX","Dolby3D"));
	
	public TheatreProperties(int n,String name,Theatre theatre) {
		for(int i=0;i<n;i++)
		{
			String ScreenName=""+(screenId++);
			String screenType=this.screenType.get((int)(Math.random()*2));
			String conditioner=this.conditioner.get((int)(Math.random()*2));
			String audio=this.audioType.get((int)(Math.random()*2));
			String sizeRatio="16:9";
			Screen sc=new Screen(i,ScreenName,screenType,conditioner,audio,sizeRatio,name);
			theatre.getScreenList().add(sc);
			Properties.movieScreen.add(sc);
		//	System.out.println(sc);
		}
	}

}
