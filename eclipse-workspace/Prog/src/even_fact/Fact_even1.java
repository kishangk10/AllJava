package even_fact;

public class Fact_even1 
{
	public static void main(String[] args) 
	{
		int no =10;
		int fact=1;
		for(int i=1; i<=no;i++)
		{
			fact=fact*i;
			if(i % 2 == 0)
			{
				System.out.println(i+"  "+fact);
			}
		}

	}

}
