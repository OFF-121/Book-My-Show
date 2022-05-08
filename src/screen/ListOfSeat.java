package screen;

import java.util.ArrayList;
import java.util.Scanner;


public class ListOfSeat {

	
	private int totalSeat;
	private boolean firstTime=true;
	private Seat seat[];
	private SeatProperty seatProperty;
	private ArrayList<Integer> booked=new ArrayList<Integer>();
	private static ArrayList<Integer> totelBooked=new ArrayList<Integer>();
	
	
	
	public int getTotalSeat() {
		return totalSeat;
	}
	public boolean isFirstTime() {
		return firstTime;
	}
	public Seat[] getSeat() {
		return seat;
	}
	public ArrayList<Integer> getBooked() {
		return booked;
	}
	public ArrayList<Integer> getTotelBooked() {
		return totelBooked;
	}
	
    public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public void setFirstTime(boolean firstTime) {
		this.firstTime = firstTime;
	}
	public void setSeat(Seat[] seat) {
		this.seat = seat;
	}
	public void setBooked(ArrayList<Integer> booked) {
		this.booked = booked;
	}
	public void setTotelBooked(ArrayList<Integer> totelBooked) {
		ListOfSeat.totelBooked = totelBooked;
	}


	public ListOfSeat(int totalSeat) {
			this.totalSeat=totalSeat;
			this.seat=new Seat[totalSeat+1];
			setSeat(seat);
			seat=new Seat[totalSeat+1];
			for(int i=1;i<=totalSeat;i++)
			{
				seat[i]=new Seat();
				String s="| "+i+" |";
				seat[i].setSeatNumber(s);
			}
			seatProperty=new SeatProperty();
		}

	}
