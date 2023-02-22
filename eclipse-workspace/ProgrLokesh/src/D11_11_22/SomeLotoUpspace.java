package D11_11_22;

import java.util.Scanner;

public class SomeLotoUpspace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentance");
		String str = sc.nextLine();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <='z') && (ch != ' '))
			{
				int x =(int)ch;
				res += (char)(x-32);
			}else
				res += ch;
		}
		System.out.println(res);
	}
}
