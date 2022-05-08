package screen;

import java.util.Arrays;
import java.util.Scanner;

public class SeatProperty {
	int totalSeats;

	public SeatProperty() {
	}
	
	public void check(ListOfSeat seatList) {
		Seat seat[]=seatList.getSeat();
		if(seatList.getTotelBooked().size()>0) {
			String display=(seatList.isFirstTime())?"YOUR BOOKED SEATS":"SEATS WHICH ARE ALREADY BOOKED";
			System.out.println(display);
			seatList.setFirstTime(false);
			System.out.println("\n"+seatList.getBooked()+"\n\n");
		}
		for(int i:seatList.getBooked())
		{
			if(seat[i].isBooked())
			{
				seat[i].setSeatNumber("|"+"B"+"|");
			}
		}
	}
	
	public void	displaySeat(ListOfSeat seatList,String display)
    {
		Seat seat[]=seatList.getSeat();
    	check(seatList);
    	try {Thread.sleep(1000);}
		catch (Exception e) {}
    	
    	System.out.println("----------"+display+"-----------");
    	for(int i=1;i<=seatList.getTotalSeat();i++)
		{
			if( i%10==3 || i%10==9) System.out.print("           ");
			System.out.print(seat[i].getSeatNumber()+"   ");
			if(i%10==0) System.out.println("\n");
		}
    }
	
	 public void editSeats(ListOfSeat seatList,int totalSeats) {
    		seatList.getBooked().clear();
    		Seat seat[]=seatList.getSeat();
	    	Scanner sc=new Scanner(System.in);
	    	for(int i=0;i<totalSeats;i++)
			{
				int num=sc.nextInt();
				seat[num].setBooked(true);
				seatList.getBooked().add(num);
				seatList.getTotelBooked().add(num);
			}
	    }

}
