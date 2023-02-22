package D15_11_22;

import java.util.Scanner;

public class PrintPosNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
//		int num = sc.nextInt();
//		if(num <0)
//			num = num *(-1);
//		System.out.println(num);
		
		int num = sc.nextInt();
		if(num >0)
			num = num *(-1);
		System.out.println(num);
	}
}
