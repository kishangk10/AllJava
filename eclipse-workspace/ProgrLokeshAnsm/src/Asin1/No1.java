package Asin1;

import java.util.Arrays;
import java.util.Scanner;

public class No1 
{
	static void sumElm(int[] no)
	{
		int sum = 0;
		for (int i = 0; i < no.length; i++) {
			sum=sum+no[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//int[] arr={10,82,1,23,15,47};
		sumElm(arr);
	}
}
