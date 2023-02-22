package A_Z;

public class R18 {
	private static void add(int n)
	{
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1&&j<=n/2&&j!=n/2+1||j==1||i==n/2+1&&j<=n/2+1||
						j==n/2+1&&i<=n/2&&i!=1||i==j&&i>=n/2+1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		add(7);
	}
}
