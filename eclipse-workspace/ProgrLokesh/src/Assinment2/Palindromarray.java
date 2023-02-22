package Assinment2;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromarray
{
	static int[] arrPal(int[] arr)
	{
		int[] brr = new int[arr.length];
		for (int i = 0, j=arr.length-1; i <= arr.length && j>=0; i++,j--) 
		{
			brr[i] = arr[i];
		}
		if(arr == brr)
			return brr;
		else
			return brr;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] arr= new int[size];
		
		System.out.println("enter the array elements ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		int[] x = arrPal(arr); 
		System.out.println(Arrays.toString(x));
	}
}
