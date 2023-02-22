package Unsortedarry;

public class Minimum1 
{
public static void main(String[] args)
{
int[] arr ={10,3,8,2,9};
int min1st=arr[0];
int min2nd=0;
for(int i =0; i<arr.length;i++)
	{
		if(arr[i]<min1st)
		{
			min2nd = min1st;
			min1st = arr[i];
		}else if(arr[i]<min2nd)
		{
			min2nd = arr[i];
		}
	}
System.out.println(min2nd);
}
}
