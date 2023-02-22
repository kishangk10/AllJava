package Asin1;

import java.util.Scanner;

public class No19
{
	static int sum1=0;
	static int sum2=0;
	static void sumofperfect(int no)
	{
		int copy=no;
		int sum = 0;
		for (int i = 1 ; i < no/2; i++)
		{
			if(no%i == 0)
				sum=sum+i;
		}
		if(sum==copy){
			sum1+=sum;
			System.out.println("perfect number...> "+sum);}
		if(sum==copy){
			sum2+=sum1;
		System.out.println("the sum of strong number ...>"+sum1);}
	}
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the arrya size");
//		int size= sc.nextInt();
//		int[] arr=new int[size];
//		
//		System.out.println("enter the array elements");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();	
//		}
		for (int i = 0; i < 100000; i++) {
			int no=i; 
		
			sumofperfect(no);	
		}
	}
}
