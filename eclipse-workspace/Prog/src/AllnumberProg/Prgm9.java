package AllnumberProg;

import java.util.Scanner;
public class Prgm9
{
	static void prg(int no)
	{
		int evencount = 0;
		int oddcount = 0;
		while(no != 0)
		{
			int rem = no%10;
			if(rem % 2 ==0)
			{
				evencount ++;
			}else{
				oddcount ++;
			}
			no=no/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number");
		int no = sc.nextInt();
		prg(no);
	}
}
