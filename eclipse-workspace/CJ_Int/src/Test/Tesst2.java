package Test;

public class Tesst2 {
	public static void main(String[] args) {
		String str1="abbnuyxsy";
		int a[]=new int[127];
		for (int i = 0; i < str1.length(); i++) {
			char ch =str1.charAt(i);
			a[ch]++;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				System.out.print((char)(i));
			}
		}
	}
}
