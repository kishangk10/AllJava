package D15_11_22;

import java.util.Scanner;

public class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while(n%2 == 0){
			System.out.print(2+" ");
			n/=2;
		}
		for(int i = 3; i <= Math.sqrt(n) ;i=i+2)
		{
			System.out.println(Math.sqrt(n));
			while(n%i == 0)
			{
				System.out.println(i+" ");
				n = n/i;
			}
		}
		if(n > 2)
		System.out.println(n);
	}
}
