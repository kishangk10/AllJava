package D9_12_22;

public class Logic {
	public static void main(String[] args) {
		int n=4;
		String str="abc";
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-1; j++) {
				if(i==1 && j==n/2||j==1&i!=n&&i!=1||j==n-1&&i!=n&&i!=1||i==n&&j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
}
