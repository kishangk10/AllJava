package Test1;   //Strong number

import java.util.Scanner;
public class Sample2 
{
	static void StrongNum(int no)
	{
		int copy = no;
		int sum = 0;
		while(no != 0)
		{
			int rem = no%10;
			int fact = 1;
			for(int i = rem;i>=1;i--)
			{
				fact = fact*i;
			}
			sum = sum +fact;
			no=no/10;
		}
		if(sum == copy)
		{
			System.out.println(sum+"is a Strong number");
		}else{
			System.out.println(sum+"is not a Strong number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number");
		int no1=sc.nextInt();
		StrongNum(no1);
	}
}
