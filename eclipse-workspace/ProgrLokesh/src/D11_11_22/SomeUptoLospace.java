package D11_11_22;

import java.util.Scanner;
public class SomeUptoLospace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance");
		String str = sc.nextLine();
		String res = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch >='A' && ch <= 'Z') && (ch != ' '))
			{
				int no = (int)ch;
				res += (char)(no+32);
				
			}else
				res += ch; 
		}
		System.out.println(res);
	}
}
