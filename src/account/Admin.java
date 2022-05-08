package account;

import java.util.*;

import screen.Screen;

public class Admin extends User{

	private ArrayList<Screen> theatre=Properties.movieScreen;
	
	Scanner sc=new Scanner(System.in);
	public Admin(String id,String userName,String password) {
		super(id,userName,password);
	}
	
	public Admin(User user) {
		System.out.println(user+"\n\n");
		display();
	}
	
	private void display() {
		
		
		show();
		System.out.println("----------------------------BACK TO------------------------------\n\n");		
		
		System.out.println("LOGOUT");
		System.out.println("SHOW");
		System.out.println("CHANGE MOVIE");
		
		String input=sc.nextLine();
		if(input.equalsIgnoreCase("LOGOUT")) Account.LogOut();
		if(input.equalsIgnoreCase("SHOW")) show();
		
		if(input.equalsIgnoreCase("CHANGE MOVIE")) changeMovie();
	}

	private void show() {
		for(Screen screen:theatre)
		{
			System.out.println(screen+"\n\n");
		}
		return;
	}


	void changeMovie() {
		show();
		System.out.println("SCREEN NUMBER TO BE CHANGED :---");
		int n=sc.nextInt();
		sc.nextLine();
		Screen screen=theatre.get(n-1);
		System.out.println(screen);
		
		System.out.println("ENTER THE MOVIE NAME");
		String name=sc.nextLine();
		screen.getMovie().setMovieName(name);
		System.out.println(screen);
		display();
	}


}
