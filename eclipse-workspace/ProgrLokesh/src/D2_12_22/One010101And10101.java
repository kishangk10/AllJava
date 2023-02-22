package D2_12_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One010101And10101 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter the number....... ");
		String str=br.readLine();
		int n= Integer.parseInt(str);
		int star=n;
		int space=0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <=star; k++) {
				
				System.out.print(k%2+" ");
			}
			System.out.println();
			
			if (i<=n/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;
			}
		}
	}

}
