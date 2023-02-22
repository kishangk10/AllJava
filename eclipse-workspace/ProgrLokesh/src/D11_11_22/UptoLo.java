package D11_11_22;

import java.util.Scanner;

public class UptoLo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String str = sc.nextLine();
		String res = "";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			int x = (int)ch;
			res += (char)(x+32);
		}
		System.out.println(res);
	}

}
