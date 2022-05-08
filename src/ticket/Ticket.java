package ticket;

import java.time.LocalDate;
import java.util.*;

public class Ticket  {

    private String userName;
    private String movieName;
    private int noOfTickets;
    private ArrayList<Integer> seatList;
    private String date;
    private LocalDate d=LocalDate.now();
  
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public ArrayList<Integer> getSeatList() {
		return seatList;
	}

	public void setSeatList(ArrayList<Integer> seatList) {
		this.seatList = new ArrayList<>(seatList);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Ticket() {
		
	}

	@Override
	public String toString() {
		return " TICKET-DETIALS \n"
				+ "------------------------------\n"
				+ " UserName=" + userName 
				+ "\n MovieName=" + movieName
				+ "\n NoOfTickets=" + noOfTickets
				+ "\n SeatNumbers=" + seatList 
				+ "\n DateOfBooked=" + d ;
	}

	public Ticket(String userName, String movieName, int totalSeats, ArrayList<Integer> booked, String date) {
		setUserName(userName);
		setMovieName(movieName);
		setNoOfTickets(totalSeats);
		setSeatList(booked);
		setDate(date);
	}

}