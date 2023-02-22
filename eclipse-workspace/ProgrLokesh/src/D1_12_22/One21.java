package D1_12_22;

public class One21 {
	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n/2;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			int x=1;
			for (int j = 1; j <=star; j++) {
				System.out.print(x+" ");
				if(j<star/2+1)
					x++;
				else
					x--;
			}
			System.out.println();
			if(i<=n/2){
				star+=2;
				space--;
			}else{
				star-=2;
				space++;
			}
		}
				
	}
}
