package ticket;

import java.util.Scanner;

import account.Customer;

public class CancelTicket {

	public CancelTicket(Customer customer) {
		MyBooking booking=new MyBooking(customer);
		booking.show(customer.getTicket());
		
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("TICKET TO BE DELETED");
		int n=sc.nextInt();
		
		customer.getTicket().remove(n);
		System.out.println("TICKET CANCELED");
		booking.show(customer.getTicket());
		
	}

}
