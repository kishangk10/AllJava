package A_Z;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the nubmber ");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=n; j++) {
				if(i==1&&j<=n/2+1||j==1&&i<n/2+1||
						i==n/2+1&&j<=n/2+1||j==n/2+1&&i<=n/2+1||
						i==j&&i>=n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
