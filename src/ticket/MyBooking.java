package ticket;

import java.util.*;

import account.Customer;

public class MyBooking  {
	
	public MyBooking(Customer customer){
		System.out.println("BOOKING HISTORY\n");
		show(customer.getTicket());
		System.out.println("");
	}

	public void show(ArrayList<Ticket> ticket) {
		for(Ticket t: ticket)
		{
			System.out.println(1+"\n"+t+"\n");
		}
		
	}
}
