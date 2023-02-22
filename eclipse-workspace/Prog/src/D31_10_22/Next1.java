package D31_10_22;

import java.util.Arrays;
public class Next1 
{
	public static void main(String[] args) 
	{
		String str = "hoga beda huduge nanna bittu";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			String str1 =" ";
			while(i<ch.length && ch[i] != ' ')
			{
				str1 = str1+ch[i];
				i++;
			}
			if(str1.length()>0)
			{
				System.out.print(str1+" "+str.length()+" ");
			}
		}
	}

}
