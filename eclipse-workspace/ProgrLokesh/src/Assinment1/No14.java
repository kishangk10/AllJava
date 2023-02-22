package Assinment1;

public class No14 
{
	public static void main(String[] args) 
	{
		int[] arr ={10,82,1,23,15,47};
		int ecount = 0;
		int ocount =0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				ecount++;
			}
		if(arr[i]%2 != 0)
			{
				ocount++;
			}
		}
		System.out.println(ecount);
		System.out.println(ocount);
	}
}
