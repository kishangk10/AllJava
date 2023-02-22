package D11_11_22;

import java.util.Scanner;

public class LotoUpSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' '){
				int no = (int)ch;
				res+=(char)(no-32);
			}else
				res+=ch;
		}
		System.out.println(res);
	}

}
