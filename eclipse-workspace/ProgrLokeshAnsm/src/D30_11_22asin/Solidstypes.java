package D30_11_22asin;

public class Solidstypes {
	public static void main(String[] args) {
	int n=7;
	int star=1;
	int space=n/2;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= space ; j++) {
			System.out.print("  ");
		}
		for (int k = 1; k <= star; k++) {
			
	//	System.out.print(k+" ");		//1
			
			
	//	System.out.print(i+" ");			//4 link
			
			
//			if(i%2==0)						//2
//			System.out.print("0 ");
//			else
//			System.out.print("1 ");
			
			
//			if(k%2==0)						//3
//				System.out.print("0 ");
//				else
//				System.out.print("1 ");
		}
		System.out.println();
		if(i<=n/2)
		{
			star+=2;
			space--;
		}else{
		//	break;							//4 link
			
			star-=2;
			space++;
		}
	}

}
}
