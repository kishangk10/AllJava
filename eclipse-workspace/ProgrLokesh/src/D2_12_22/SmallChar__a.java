package D2_12_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallChar__a {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the nubmer......> ");
		String str= br.readLine();
		int n= Integer.parseInt(str);
		int star=n;
		int space=0;
		char ch='a';
		char cp='A';
		for (int i =1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j =1; j <=star; j++) {
				if(ch>='a'&&ch<='z'){
				System.out.print(ch+" ");
				Thread.sleep(200);
				ch++;
				}else{
					System.out.print(cp+" ");
					Thread.sleep(200);
					cp++;
				}
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
