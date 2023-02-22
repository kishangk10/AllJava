package D5_12_22;

public class One7151311131517 {
	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n-2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=star; j++) {
				System.out.print(i+" ");
			}
			for (int k = 1; k <=space; k++) {
				System.out.print("  ");
			}
			for (int l = star; l >=1; l--) {
				if(l<=n/2)
				System.out.print(i+" ");
			}
			System.out.println();
			if (i<=n/2) {
				space-=2;
				star++;
			}else{
			space+=2;
			star--;
			}
		}
	}

}
