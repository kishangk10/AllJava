package D31_10_22;

import java.util.Arrays;
public class Noofchar 
{
	public static void main(String[] args) 
	{
		String str = "hoga beda huduge nanna bittu";
		char[] chr = str.toCharArray();
		int count = 0;
		for(int i=0; i< chr.length; i++)
		{
			if(chr[i] != ' ')
			{
				count++;
			}
		}
			System.out.println(count);
	}
}
