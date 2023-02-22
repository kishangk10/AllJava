package A_Z;

public class V22 {
	int add(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				//if(i==j||j==n)
				if(j==1||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
		return n;
	}
	public static void main(String[] args) {
		V22 v1= new V22();
		int x=v1.add(7);
	}
}
