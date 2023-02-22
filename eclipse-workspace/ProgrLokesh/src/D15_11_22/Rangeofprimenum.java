package D15_11_22;

public class Rangeofprimenum 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i = 2; i <= 100; i++)
		{
			boolean jsp = true;
			for (int j = 2; j < i; j++) 
			{
				if(i%j == 0)
				{
				jsp = false;
				break;
				}
			}
			if(jsp)
			{	
				count++;
				//System.out.println(count);
				System.out.println(count+" "+i+"it is a prime number");
			}
		}
	}
}
