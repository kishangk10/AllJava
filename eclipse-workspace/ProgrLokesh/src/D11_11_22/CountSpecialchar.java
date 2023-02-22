package D11_11_22;

import java.util.Scanner;				//kihan @ 123456789 #@$%

public class CountSpecialchar 
{
	public static void main(String[] args) 
	{
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the sentance");
			String str = sc.nextLine();
			String res = "";
			int count = 0;
			for (int i = 0; i < str.length(); i++) 
			{
				char ch = str.charAt(i);
				if((ch <= 'a' && ch >= 'z') && (ch <= '0' && ch >= '9'))
				{
				count++;
				}
//				}else
//					count++;
			}
			System.out.println(count);
		}
	}
}
