package D15_11_22;

import java.util.Scanner;

public class NpoweP 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int base = sc.nextInt();
		int exp = sc.nextInt();
		int ans =1;
		while(exp != 0)
		{
			ans = ans*base;
			exp--;
		}
		System.out.println(ans);
	}
}
