package Mock;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Hotel Menu \n1. Italian Pizza Amount= 170 \n2. Mexican Pizza Amount = 250 \n3. Other \n4. to confirm your Order ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("You are Order is Italian Pizza");
				break;
			case 2:
				System.out.println("You are Order is Mexican Pizza");
				break;
			case 3:
				System.out.println("Sorry we have Only two pizzas at this time");
				break;
			case 4:
				flag= false;
				System.out.println("Your Order will be in 5 minits");
				break;
			default:
				System.out.println("We have Only to pizza"+
						"\n---<( Thank You )>---");
				break;
			}
		}
	}
}
