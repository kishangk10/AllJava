package D15_11_22;

import java.util.Scanner;

public class NthPrimenum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int no = sc.nextInt();
		int count=0;
		for (int i = 2; i <= 100; i++)
		{
			boolean jsp = true;
			for (int j = 2; j < i; j++) 
			{
				if(i%j == 0)
				{
				jsp = false;
				break;
				}
			}
			if(jsp)
			{	
				count++;
				//System.out.println(count);
				if(count == no)
				System.out.println(count+" is....> "+i+" it is a prime number");
			}
		}
	}
}
