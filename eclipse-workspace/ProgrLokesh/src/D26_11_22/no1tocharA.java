package D26_11_22;

import java.util.Arrays;
import java.util.Scanner;

public class no1tocharA 
{
	static void convert(int no[])
	{
		Arrays.sort(no);
		char[] ch = new char[no.length];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char)(no[i]+64);
		}
		System.out.println(ch);
 	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size ");
		int size = sc.nextInt();
		int[] no= new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < no.length; i++) {
			no[i]=sc.nextInt();
		}
		convert(no);
	}
}
