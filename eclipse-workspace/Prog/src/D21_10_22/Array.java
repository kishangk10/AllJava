package D21_10_22;

import java.util.Scanner;
public class Array
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int no = s1.nextInt();
		int rev = 0;
		int copy = no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(rev);
		if(rev == copy)
		{
		System.out.println("Number is a Palindroum");
		}else{
			System.out.println("Number is not a Palindroum");
		}
		}
}

