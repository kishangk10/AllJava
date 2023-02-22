package AllnumberProg;

import java.util.Scanner;
public class Prgm10 
{
	static void prg(int no)
	{
		int copy = no;
		System.out.println(copy);
		int sum = 0;
		for (int i = 1; i<= no/2; i++) 
		{
			if(no % i == 0)
			{
				sum = sum + i;
				System.out.println(sum+" "+i);
			}
		}
			if(sum == copy)
			{
				System.out.println(sum+"The number is Strong number");
			}else{
				System.out.println(sum+" The number is not a strong number");
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
