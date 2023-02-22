package D23_11_22;

import java.util.Scanner;

public class K11 
{
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("entr the number");
//		int n=sc.nextInt();
		System.out.println("-------------------");
		int n=7;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++) 
			{
				if (j==n/2+1 || (i==j && j>=n/2+1 )||(i+j==n+1 && j>=n/2+1 )) 
					System.out.print("* ");
					else
					System.out.print("  ");
			}
			System.out.println();
		}
	}	
}
