package AllnumberProg;

import java.util.Scanner;
public class Prgm5 
{
	static void prg(int no1, int no2)
	{
		int temp = no1;
		no1 = no2;
		no2 = temp;
		System.out.println(no1+" "+no2);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int no1 = sc.nextInt();
		System.out.println("Enter the second number");
		int no2 = sc.nextInt();
		prg(no1,no2);
	}
}
