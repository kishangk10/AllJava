package D23_11_22;

public class LeftStar 
{
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if( i==1 || j==1 || i==5 ||j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

//o/p
//* * * * *

//o/p
//* * * * * 
//* 
//* 
//* 
//* 

//o/p
//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * * 
//
