package Array1d;

import java.util.Scanner;

public class MainRedBus {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RedBus rb = new RedBus(40);
		System.out.println("\t" + "WELCOME TO REDBUS ONLINE BOOKING");
		System.out.println("***********************************************");
		System.out.println("\t" + "How many Tickets you want to book");
		int no = sc.nextInt();

		if (no != 0) {
			if (no <= 40) {
				for (int i = 0; i < no; i++) {
					System.out.println("Enter the locatin and seat Number");
					rb.ticketBooking(sc.nextInt(), sc.nextInt());
				}
//				for (int i = 0; i < rb.arr.length; i++) {
//					System.out.println(rb.arr[i]);
//				}
				System.out.println(" Would you like to check your confirm you ticker ");
				System.out.println("1. to confirm  \n0. to cancle your Ticket");
				int conf = sc.nextInt();
				if (conf == 1) {
					System.out.println("--> Ur ticket is Confirmed <--");
					rb.confirmation();
					System.out.println("---<( Happy Journy )>---");
				} else if (conf == 0) {
					rb.ticketCansling();
//					for (int i = 0; i < rb.arr.length; i++) {
//						System.out.println(rb.arr[i]);
//					}
					System.out.println("--<( Thank You )>--");
				}

			} else {
				System.out.println("!!!! In our bus we have only 40 seat !!!!");
			}
		} else {
			System.out.println("!!!! You want to book Atleast one Ticket !!!!");
		}

	}
}
