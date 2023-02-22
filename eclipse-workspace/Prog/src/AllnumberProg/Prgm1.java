//String number
package AllnumberProg;

import java.util.Scanner;
public class Prgm1 
{
	static void prg(int no)
	{
		int copy = no;
		int sum = 0;
		while(no!=0)
		{
			int fact =1;
			int rem = no%10;
			for (int i = rem; i >1; i--) 
			{
				fact = fact*i;
			}
			sum = sum+fact;
			no=no/10;
		}
		if(sum == copy)
		{
			System.out.println("the number is strong number");
		}else{
			System.out.println("the given number is not a strong number");
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
