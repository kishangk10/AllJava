package A_Z;

public class T20 {
	int add(){
		int n=7;
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=n; j++) {
				if(i==1||j==n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
		return n;
	}
	public static void main(String[] args) {
		T20 t1=new T20();
		int x=t1.add();
		System.out.println("Done the T "+x);
	}
}
