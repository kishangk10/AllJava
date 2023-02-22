//with out using 3rd variable
package AllnumberProg;

import java.util.Scanner;
public class Prgm6 
{
	static void prg(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number ");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		prg(a, b);
	}
}
