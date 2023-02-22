package D24_11_22;

import java.util.Scanner;

public class FreqofChar 
{
	static void charfact(String str)
	{
		char ch[] = str.toCharArray();
		int dup=-1;
		int fr[]=new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
					count++;
				fr[j]=dup;
			}
			if(ch[i]!=dup)
				fr[i]=count;
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=dup)
				System.out.println(ch[i]+"---->"+fr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string elements ");
		String str = sc.nextLine();
		charfact(str);
	}
}
