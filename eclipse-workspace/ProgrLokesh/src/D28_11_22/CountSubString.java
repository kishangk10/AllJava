package D28_11_22;

import java.util.Arrays;

public class CountSubString 
{
	public static void main(String[] args) {
		String str = "jony jony yes eating sugar";
		String sub="pappa";
		String ch[]=str.split(sub);
		System.out.println(Arrays.toString(ch));
		if(str.startsWith(sub)==false && str.endsWith(sub)==false)
			System.out.println(ch.length-1);
		if(str.startsWith(sub)==true && str.endsWith(sub)==true)
			System.out.println(ch.length);
		if(str.startsWith(sub)==true || str.endsWith(sub)==true)
			System.out.println(ch.length);
		
	}
}
