package A_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L12 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the number....>");
		String str=br.readLine();
		int n= Integer.parseInt(str);
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==1||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
