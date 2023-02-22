package Pract;

import java.util.Scanner;

public class Dyn {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int fib1 = sc.nextInt();
		System.out.println("Enter the another value");
		int fib2= sc.nextInt();
		int fib3;
		System.out.println(fib1+" "+fib2);
		for(int i=1; i<=10; i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}

}
