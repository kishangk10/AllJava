package D6_11_22_testcases;

import java.util.Scanner;
public class Monkey 
{
	public static boolean smile(boolean aSmile,boolean bSmile)
	{
		if(aSmile == true && bSmile == true)
		{
			return true;
		}else if (aSmile == false && bSmile == false )
		{
			return true;
		}else{
			return false;
		}
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the 1st i/p ");
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		System.out.print("enter the 2st i/p ");
		boolean a1 = sc.nextBoolean();
		boolean b1 = sc.nextBoolean();
		System.out.print("enter the 3st i/p ");
		boolean a2 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		System.out.println(smile(a, b));
		System.out.println(smile(a1, b1));
		System.out.println(smile(a2, b2));
	}
}

