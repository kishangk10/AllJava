package D15_11_22;

import java.util.Scanner;

public class XylemOrPhloemNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int copy = num;
		int Osum = 0;
		int Isum = 0;
		while(num != 0)
		{
			if(num == copy || num <=9)
				Osum = Osum + num%10;
			else
				Isum = Isum + num%10;
			
			num = num/10;
		}
		if(Osum == Isum)
			System.out.println("It is a Xylem number");
		else
			System.out.println("It is a Phloem number");
	}
}