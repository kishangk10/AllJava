package D14_11_22;

import java.util.Scanner;

public class HappyNuber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum;
		while(num > 9)
		{
			sum =0;
			do{
				int rem =num%10;
				sum=sum+rem*rem;
				num=num/10;
			}while(num !=0);
				num=sum;
		}
		if(num == 1 || num == 7)
			System.out.println("Happy Number");
		else
			System.out.println("not a happy number");
			
	}
}
