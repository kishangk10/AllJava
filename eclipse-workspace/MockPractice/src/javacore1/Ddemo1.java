package javacore1;

import java.util.Scanner;

public class Ddemo1 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the elements");
		int no=sc.nextInt();
		for (int i = 2; i < no; i++)
		{
			if(no%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
