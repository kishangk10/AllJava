package D23_11_22;

public class Dimand {
	public static void main(String[] args) {
		
	int n=9;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <= n; j++) {
			if((i==1 &&j==n/2+1)||(i==n &&j==n/2+1)||(i==n/4&&i==j)||(i==n/4&&i+j==n+1)||(i==n-1&&i+j==n+1)||(i==n-1&&i==j)||
					(j==n && i==n/2+1)||(j==1 && i==n/2+1) )
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}