package A_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J10 {
	public static void main(String[] args) throws IOException {
		InputStreamReader i1=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(i1);
		System.out.println("enter some values.......");
		String a= br.readLine();
		int x= Integer.parseInt(a);
//		System.out.println(x);
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <=x; j++) {
				if(i==1
						||j==x/2+1&&i+j!=x+x/2+1
						||i==x&&j<=x/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
