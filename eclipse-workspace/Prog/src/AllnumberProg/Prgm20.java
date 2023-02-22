package AllnumberProg;

import java.util.Scanner;
public class Prgm20 
{
	static void prg(int no)
	{
		int copy = no;
		double sum = 0;
		while(no != 0)
		{
			int rem = no%10;
			sum = sum+(rem*rem*rem);
			no=no/10;
		}
		if(copy == sum)
		{
			System.out.println("The number is armstrong");
		}else{
			System.out.println("The number is not armstrong");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int no = sc.nextInt();
		prg(no);
	}
}
