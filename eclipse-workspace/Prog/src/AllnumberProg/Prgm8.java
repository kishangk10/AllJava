package AllnumberProg;

import java.util.Scanner;
public class Prgm8 
{
	static void prg(int no)
	{
		int copy = no;
		int rev = 0;
		while(no != 0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev == copy)
		{
			System.out.println("The number is Palindrom");
		}else{
			System.out.println("The number is not a Palindrom");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		prg(no);
	}
}
