package D6_11_22_testcases;

import java.util.Scanner;
public class AbsoluteDiff 
{
	public static int diff(int n)
	{
		if(21>=n)
		{
			return 21-n;
		}
		return (-2)*(21-n); 
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int x = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		System.out.println(diff(x));
		System.out.println(diff(x1));
		System.out.println(diff(x2));
	}
}

//enter the input
//5
//5
//5
//output
//16
//16
//16

