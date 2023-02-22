package AllnumberProg;

import java.util.Scanner;
public class Prgm2 
{
	static void prg(int fib1,int fib2)
	{
		int fib3;
		System.out.println(fib1+ " " + fib2);
		for (int i = 0; i < 10; i++) 
		{
			fib3 = fib1 +fib2;
			System.out.print(fib3+" " );
			fib1 = fib2;
			fib2 = fib3;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int fib1 = sc.nextInt();
		System.out.println("enter the second number");
		int fib2 = sc.nextInt();
		prg(fib1,fib2);
	}
}
