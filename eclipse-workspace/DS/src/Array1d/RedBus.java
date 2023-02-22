package Array1d;

import java.util.Iterator;

public class RedBus {
	public int arr[] = null;

	public RedBus(int numofseats) {
		arr = new int[numofseats];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

//	Ticket Booking
	public void ticketBooking(int location, int seatNumber) {

		if (arr[location] == Integer.MIN_VALUE) {
			arr[location] = seatNumber;
			System.out
					.println("Your seat number " + seatNumber + " is sucessfully bookeed in the location " + location);
		} else {
			System.out.println("Sorry Your seat is alredy bookeed");
		}
	}
	
//	Confirmation
	public void confirmation() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != Integer.MIN_VALUE) {
				System.out.println("Your seat is confirmed in location "+i+" and the seat is "+arr[i]);
			}
		}
	}
	
	
//	To Remove the Ticket
	public void ticketCansling() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
}
