package A_Z;

public class Creative {
	public static void main(String[] args) throws InterruptedException {
		int n=7;{
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(j==n/2+1||i+j==n+1&&i<=n/2+1||i==j&&i>=n/2+1){
						System.out.print("@ ");//k
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==1||j==1||j==n||i==n/2+1){
						System.out.print("@ ");//a
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(j==1||i==j||j==n){
						System.out.print("@ ");//n
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==1||j==n/2+1){
						System.out.print("@ ");//t
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(j==1||j==n||i==n/2+1){
						System.out.print("@ ");//h
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==1||j==1||j==n||i==n/2+1){
						System.out.print("@ ");//a
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(j==1||i==1&&j<=n/2+1||j==n/2+1&&i<=n/2+1||i==j&&i>=n/2+1||i==n/2+1&&j<=n/2+1){
						System.out.print("@ ");//r
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==1||j==1||j==n||i==n/2+1){
						System.out.print("@ ");//a
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==1||j==n/2+1||i==n&&j<=n/2+1){
						System.out.print("@ ");//j
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(i==n||j==1||j==n){
						System.out.print("@ ");//u
						Thread.sleep(100);
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
		}
	}
}
