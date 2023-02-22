package A_Z;

public class S19 {
	private void add(int n)
	{
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1&&i<=n/2+1||i==n||i==n/2+1||j==n&&i>=n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
public static void main(String[] args) {
	S19 s1=new S19();
	s1.add(7);
}
}
