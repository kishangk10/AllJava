package D6_11_22_testcases;

import java.util.Scanner;
public class DoubleSum6 
{
	public static int doublSum(int a , int b)
	{
		if(a == b)
		{
			return (a+b)*2;
		}
		return a+b;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		System.out.println(doublSum(a, b));
		System.out.println(doublSum(a1, b1));
		System.out.println(doublSum(a2, b2));
	}
}
