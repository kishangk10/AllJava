package A_Z;

public class B2 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if((i==1 && i+j!=n+1)||j==1||(i==n&&i!=j)||(j==n && i+j!=n+1 &&i!=j)||i==n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
}
}
