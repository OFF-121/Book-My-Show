package screen;

import java.util.ArrayList;

public class Seat {

	private String seatNumber;
	private boolean isBooked;
	
	
	public String getSeatNumber() {
		return seatNumber;
	}
	public boolean isBooked() {
		return isBooked;
	}
	
    public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
    
	
    public  Seat() {
		this.isBooked=false;
		this.seatNumber="";
	}

}
