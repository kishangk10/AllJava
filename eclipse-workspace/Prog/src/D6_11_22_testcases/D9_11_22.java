package D6_11_22_testcases;

public class D9_11_22 
{
	public static void main(String[] args) 
	{
		String str ="J#a##v#a##";
		String str1 = "";
		String str2 = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == '#')
			{
				str1 = str1 + ch[i];
			}else{
				str2 = str2 + ch[i];
			}
		}
			String result = str1.concat(str2);
			System.out.println(result);
		
		
//		for (int i = 0; i < str.length(); i++) 
//		{
//			if(str.charAt(i)=='#')
//			{
//			str1 = str1+str.charAt(i);
//			}else{
//			str2=str2+str.charAt(i);
//			}
//		}
//		System.out.println(str1+str2);
	}
}


