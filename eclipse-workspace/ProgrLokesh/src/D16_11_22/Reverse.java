package D16_11_22;

import java.util.Arrays;

public class Reverse 
{
	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5};
	System.out.println(arr);
	int[] brr = new int[arr.length];
	for (int i = 0,j=arr.length-1 ; i < arr.length && j>=0 ; i++,j--)
	{
		brr[i]=arr[i];
	}
	System.out.println(Arrays.toString(brr));
	}
}
