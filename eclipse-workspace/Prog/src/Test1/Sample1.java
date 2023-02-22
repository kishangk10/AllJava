package Test1;

import java.util.Scanner;
public class Sample1 
{
	static int facts(int no)
	{
		int fact =1;
	for(int i = no; i>=1;i--)
	{
		fact = fact*i;
	}
	return fact;
}	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int no1=sc.nextInt();
		int x=facts(no1);
		System.out.println(x);
	}
}
