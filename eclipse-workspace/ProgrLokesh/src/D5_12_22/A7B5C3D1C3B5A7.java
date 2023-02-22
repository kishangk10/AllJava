package D5_12_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A7B5C3D1C3B5A7 {
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		System.out.println("enter the nuber....>");
		String str=bufferedReader.readLine();
		int n=Integer.parseInt(str);
		int star=1;
		int space=n-2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=star; j++) {
				System.out.print((char)(64+j)+" ");
			}
			for (int k = 1; k <=space; k++) {
				System.out.print("  ");
			}
			for (int l = star; l >=1; l--) {
				if(l<=n/2)
				System.out.print((char)(96+l)+" ");
			}
			System.out.println();
			if (i<=n/2) {
				space-=2;
				star++;
			}else{
				space+=2;
				star--;
			}
		}
	}
}
