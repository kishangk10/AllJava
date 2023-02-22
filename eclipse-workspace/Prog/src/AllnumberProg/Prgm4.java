package AllnumberProg;

import java.util.Scanner;
public class Prgm4 
{
	static void prg(int no)
	{
		boolean flag = true;
		for (int i = 2; i < no; i++) 
		{
			if(no%i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("The given number is prime number");
		}else{
			System.out.println("The given number is not a prime number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		prg(no);
	}
}
