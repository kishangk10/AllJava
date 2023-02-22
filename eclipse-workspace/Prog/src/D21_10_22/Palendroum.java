package D21_10_22;

public class Palendroum 
{
	public static void main(String[] args) 
	{
		int no = 1221;
		int rev = 0;
		int copy = no;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev == copy)
		{
		System.out.println("Number is a Palindroum");
		}else{
			System.out.println("Number is not a Palindroum");
		}
		}
}

