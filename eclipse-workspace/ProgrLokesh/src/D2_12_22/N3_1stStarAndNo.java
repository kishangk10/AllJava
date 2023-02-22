package D2_12_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N3_1stStarAndNo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the nubers.....");
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int star=1;
		int space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=star; j++) {
				if(i%2!=0)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
			if (i<=n/2) {
				star+=2;
				space--;
			}else {
				break;
//				star-=2;
//				space++;
			}
		}
	}
}


//o/p
//enter the nubers.....
//7
//      * 
//    1 2 3 
//  * * * * * 
//1 2 3 4 5 6 7 