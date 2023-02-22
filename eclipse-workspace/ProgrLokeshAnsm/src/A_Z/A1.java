package A_Z;

public class A1 
{
	public static void main(String[] args) {
		int n=17;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||j==n||i==n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
//11 12 13 14 15 16 17
//21 22 23 24 25 26 27
//31 32 33 34 35 36 37
//41 42 43 44 45 46 47
//51 52 53 54 55 56 57
//61 62 63 64 65 66 67
//71 72 73 74 75 76 77