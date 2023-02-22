package D26_11_22;

import java.util.Arrays;
import java.util.Scanner;

public class Zto26 
{
	static void convert(char[] ch)
	{
		Arrays.sort(ch);
		int res[] = new int[ch.length];
		for (int i = 0; i < res.length; i++) {
			res[i]=(int)(ch[i]-64);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int size = sc.nextInt();
		char[] ch =new char[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < ch.length; i++) {
			ch[i]=sc.
		}
		System.out.println(ch);
	}
}
