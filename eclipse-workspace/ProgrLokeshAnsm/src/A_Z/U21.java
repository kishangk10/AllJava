package A_Z;

public class U21 {
	int n;
	U21(int n)
	{
		this.n=n;
	}
	void add(){
	for(int i=1;i<=n ;i++){
		for(int j=1;j<=n ;j++){
			if(i==n||j==1||j==n)
				System.out.print("* ");
			else
				System.out.print("  ");
		}System.out.println();
	}
	}
	public static void main(String[] args) {
		U21 u1=new U21(7);
		u1.add();
	}
}
