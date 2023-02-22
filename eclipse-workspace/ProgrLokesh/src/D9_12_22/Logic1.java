package D9_12_22;

public class Logic1 {
	public static void main(String[] args) {
		int n=6;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n/2; j++) {
				if(i==1&&j==n/2-1||i==n&&j==n/2-1||(j==1&&i!=1&&i!=n)||j==n/2&&i!=1&&i!=n)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}System.out.println();
		}
	}
}
