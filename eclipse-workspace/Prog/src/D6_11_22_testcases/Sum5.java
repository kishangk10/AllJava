package D6_11_22_testcases;

import java.util.Scanner;
public class Sum5 
{
	public static boolean add( int a ,int b)
	{
		if(a == 10 || b == 10 || (a+b ==10))
		{
			return true;
		}
		return false;
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
		System.out.println(add(a,b));
		System.out.println(add(a1,b1));
		System.out.println(add(a2,b2));
	}
}
