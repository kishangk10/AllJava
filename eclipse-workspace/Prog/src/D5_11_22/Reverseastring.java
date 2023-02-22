package D5_11_22;

import java.util.Scanner;
public class Reverseastring 
{
	String numb(String str)
	{
		String[] str1 = str.split(" ");
		String rev = " ";
		for (int i =str1.length-1; i>=0; i--) 
		{
			rev = rev+str1[i]+" ";
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		Reverseastring r1 =new Reverseastring();
		String x = r1.numb(str);
		System.out.println(x);
	}
}
