package Test1;	//Sort the arry by parameters and return type and non Static Dynamic input.

import java.util.Scanner;
public class Sample3 
{
	void sorts(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		int[] arr =new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		Sample3 s3 = new Sample3();
		s3.sorts(arr);
	}
}
