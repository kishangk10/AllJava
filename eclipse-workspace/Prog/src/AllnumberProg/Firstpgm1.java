package AllnumberProg;

import java.util.Scanner;
public class Firstpgm1 
{
	static void factOne(int no)
	{
		int fact = 1;
		for (int i = no; i >=1; i--) 
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
	    factOne(no);	
	}
}
