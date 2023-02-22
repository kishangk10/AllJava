package D3_11_22;

import java.util.Scanner;
import java.util.Arrays;

class Practice
{
	void chString(String str1,String str2)
	{
	boolean flag = true;
	if(str1.length() == str2.length())
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i = 0; i< ch2.length; i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Anagram");
		}else{
			System.out.println("Not an anagram");
		}
	}else{
		System.out.println("the length of string is not maching");
	}
	}
}
public class BtnAnagram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string2 ");
		String str2 = sc.nextLine();
		Practice a1 = new Practice();
		a1.chString(str1, str2);
	}
}
