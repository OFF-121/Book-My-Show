package account;

import java.util.HashSet;
import java.util.Scanner;

import movie.MovieList;

public class Account {

	private static HashSet<User> customer=new HashSet<>();
    private static HashSet<User> admin=new HashSet<>();
    
    static{
    	MovieList listOfMovies=new MovieList();
    	Properties p=new Properties();
    	p.addMovieScreenHandler();
    	
    	int adminId=1;
    	int customerId=1;
    	Admin admin1=new Admin((adminId++)+"","PravinKumar","19euec104");
    	
		Customer u1=new Customer((customerId++)+"","cus1","100");
		Customer u2=new Customer((customerId++)+"","cus2","101");
		Customer u3=new Customer((customerId++)+"","cus3","102");
		
		customer.add(u1);
		customer.add(u2);
		customer.add(u3);
		admin.add(admin1);
    }
    
    public static HashSet<User> getCustomer(){
   	 return customer;
   }
    public static HashSet<User> getAdmin(){
    	 return admin;
  }
    
    public static void LogOut() {
		System.out.println("\n\n\n---------------------------------------USER LOGIN------------------------------------------");
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the UserName ---");
	    String name=sc.nextLine();
	    
	    System.out.println("\n\nEnter the Password ---");
	    String password=sc.nextLine();
	    
	    User user=new User("",name, password);
	    if(Account.getAdmin().contains(user))    new Admin(user);
	    
	    else if(Account.getCustomer().contains(user)) new Customer(user);
	    	
	    else {
	    	System.out.println("\n\nINVALID USERNAME / PASSWORD");
	    	LogOut();
	    }
	}
    public static void main(String[] args) {
		LogOut();
	}
}
