package D15_11_22;

import java.util.Scanner;

public class Special2Digitno 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int d1 = num%10;
		int d2 = num/10;
		int sum = d1 + d2+(d1*d2);
		if(sum == num)
			System.out.println("Special 2 digth number");
		else
			System.out.println("not a Special 2 digth number");
	}
}
