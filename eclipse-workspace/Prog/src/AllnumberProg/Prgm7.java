//reverse a number
package AllnumberProg;

import java.util.Scanner;
public class Prgm7 
{
	void prg(int no)
	{
		int copy = no;
		int rev = 0;
		while(no != 0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the  number");
		int no = sc.nextInt();
		Prgm7 p1 = new Prgm7();
		p1.prg(no);
	}
}
