package account;

import java.util.*;

import movie.Movie;
import movie.MovieList;
import screen.ListOfSeat;
import screen.Screen;
import screen.Seat;
import screen.SeatProperty;
import theatre.Theatre;
import ticket.MyBooking;
import ticket.*;




public class Customer extends User{
 
	private  ArrayList<Ticket> ticket=new ArrayList<>();
   
	public Customer(String id,String userName,String password) {
		    super(id,userName,password);
	}
	
	
	public  ArrayList<Ticket> getTicket() {
		return ticket;
	}
	
	public Customer() {
		System.out.println("AVAILABLE MOVIES :--\n\n");
		for(Movie movie:MovieList.getMovieList())
		{
			System.out.println(movie+"\n");
		}
		System.out.println("LOGOUT ----\n ");
		System.out.println("--------------------------------ENTER MOVIE NAME--------------------------------");
	}
	
	public Customer(User user) {
		this();
		selectMovie(user);
		selectTheatre(user);
	    back(user);
	}
	
	Scanner sc=new Scanner(System.in);
	
	
	private void selectMovie(User user) {
       		String moviename=sc.nextLine();
		
       		if(moviename.equalsIgnoreCase("LOGOUT")) Account.LogOut();
		    ArrayList<Screen> x=Properties.connectMovieScreen.get(moviename);
      		for(Screen screen:x)
		    {
      			System.out.println("\n\n"+screen+"\n\n");
    		}
	    	if(x.isEmpty())
		    {
			      System.out.println("NO THEATRE AVAILABLE :-\n\n");
        		  new Customer(user);
		    }
   }
	
	private void selectTheatre(User user) {
        		System.out.println("LOGOUT ---- \n\n");
        		System.out.println("ENTER THE THEATRE NAME :--  ");
        		String TheatreName=sc.nextLine();
		
          		if(TheatreName.equalsIgnoreCase("LOGOUT")) Account.LogOut();
         		System.out.println("ENTER THE SCREEN NUMBER :--  ");
        		int screenNumber=sc.nextInt();
	        	sc.nextLine()	;
    			Screen screen=Properties.t1.getScreen(screenNumber-1);
			    System.out.println(screen);
			    bookTicket(screen,user);
	}
	
	private void bookTicket(Screen screen,User user) {
        		char ch='"';
         		System.out.println("--------------------------------ENTER "+ ch +"YES" +ch+" TO PROCEED--------------------------------");
		
         		String confirm=sc.nextLine();
         		while(!confirm.equalsIgnoreCase("YES"))
         		{
         	 			new Customer(user);
        		}
		
         		System.out.println("\n\n");
         		ListOfSeat seatList=screen.getSeatList();		
         		SeatProperty seatProperty=new SeatProperty();
         		seatProperty.displaySeat(seatList,"AVAILABE SLOTS");		
         		System.out.println("NUMBER OF SEATS :-  ");
         		int totalSeats=sc.nextInt();		
         		System.out.println("PREFFERED SEAT NUMBER :-  ");		
         		seatProperty.editSeats(seatList,totalSeats);
         		seatProperty.displaySeat(seatList,"YOUR BOOKING");
         		System.out.println("YOUR TICKET-----------");		
         		Ticket ticket=new  Ticket(user.getUserName(),screen.getMovie().getMovieName(),totalSeats,seatList.getBooked(),screen.getMovie().getReleaseDate());
         		this.ticket.add(ticket);
        		System.out.println(ticket+"\n\n\n");
	}
    
	private void back(User user) {
		        System.out.println("BACK TO--\nMY BOOKINGS :-");
         		System.out.println("TICKET CANCELATION :-");
        		System.out.println("HOME :-");
        		System.out.println("LOGOUT :-");
         		sc.nextLine();
        		System.out.println("--");
         		String getFromUser=sc.nextLine();
         		
        		if(getFromUser.equalsIgnoreCase("HOME")) new Customer(user);
        		if(getFromUser.equalsIgnoreCase("MY BOOKINGS"))   new MyBooking(this);
        		if(getFromUser.equalsIgnoreCase("LOGOUT")) Account.LogOut();
         		if(getFromUser.equalsIgnoreCase("TICKET CANCELATION")) new CancelTicket(this);
	}
}
