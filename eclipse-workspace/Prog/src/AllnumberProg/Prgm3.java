package AllnumberProg;

import java.util.Scanner;
public class Prgm3 
{
	static void prg(int fib1,int fib2)
	{
		int fib3 = 0;
		for (int i = 1; i<=10; i++) 
		{
			fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
		System.out.println(fib3);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int fib1 = sc.nextInt();
		System.out.println("enter the second number");
		int fib2 = sc.nextInt();
		prg(fib1, fib2);
	}
}
