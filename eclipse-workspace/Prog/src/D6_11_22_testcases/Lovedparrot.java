package D6_11_22_testcases;

import java.util.Scanner;
public class Lovedparrot
{
	public static boolean parrot(boolean talking, int  hour)
	{
		if(talking == true && (hour <7 || hour >20))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean pa = sc.nextBoolean();
		int ho = sc.nextInt();
		boolean paa = sc.nextBoolean();
		int hoo = sc.nextInt();
		boolean paaa = sc.nextBoolean();
		int hooo = sc.nextInt();
		System.out.println(parrot(pa, ho));
		System.out.println(parrot(paa, hoo));
		System.out.println(parrot(paaa, hooo));

	}
}
