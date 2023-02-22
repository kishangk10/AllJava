package D11_11_22;

import java.util.Scanner;

public class CountNum
{
	public static void main(String[] args) 
	{
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the sentance");
			String str = sc.nextLine();
			String res = "";
			int count = 0;
			for (int i = 0; i < str.length(); i++) 				//i/p
			{										//kihan @ 12345678901234567890 #@$%
				char ch = str.charAt(i);
				if(ch >= '0' && ch <= '9')
				{												//o/p
					count++;									// = 20
				}
			}
			System.out.println(count);
		}
	}
}
