package D1_11_22;

import java.util.Scanner;
public class Charnumber 
{
	void noChar(String str)
	{
		int[] a = new int[122];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			a[ch]++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				System.out.println((char)(i)+" "+a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Charnumber c1 = new Charnumber();
		c1.noChar(str);
	}
}
