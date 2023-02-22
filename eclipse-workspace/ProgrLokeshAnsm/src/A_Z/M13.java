package A_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M13 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the number...> ");
		String str=br.readLine();
		int n=Integer.parseInt(str);
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=n; j++) {
				if((i==j && i<=n/2+1)||(i+j==n+1 && j>n/2+1)||j==1||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
