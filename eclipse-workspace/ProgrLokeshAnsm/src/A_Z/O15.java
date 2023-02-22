package A_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O15 {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the values......>> ");
		String str=br.readLine();
		int n= Integer.parseInt(str);
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=n; j++) {
				if(i==1||i==n||j==n||j==1){
					System.out.print("* ");
					Thread.sleep(100);
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
