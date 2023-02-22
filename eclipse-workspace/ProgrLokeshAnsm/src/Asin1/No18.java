package Asin1;

import java.util.Scanner;

public class No18 
{
	static int sum1 = 0;
	static int sum2=0;
	static void sumofStrong(int no)
	{
		int copy = no;
		int sum=0;
		
		while(no!=0)
		{
			int rem = no%10;
			int fact=1;
			for (int i = rem; i > 1; i--) 
			{
				fact = fact*i;
			}
			sum+=fact;
			no/=10;
		}
		if(copy == sum){
			sum1=sum1+sum;
			System.out.println("the of strong number in a arrya...> " +sum);
			//System.out.println(" sum of strong number is...> "+sum1);
		}
		if(copy == sum){
		sum2=sum1;
		System.out.println();
		System.out.println( "The total sum is .....>"+sum2);}
//		else{
//			System.out.println();
//			System.out.println("not a strong number are "+copy);
//		}
		
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
		
			sumofStrong(no);	
		}
	}
}
