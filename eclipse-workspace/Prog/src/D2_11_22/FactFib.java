package D2_11_22;

public class FactFib 
{
	public static void main(String[] args) 
	{
		int[] arr={8134,25652,78987,6381,2675,13531};
		for (int i = 0; i < arr.length; i++) 
		{	
			int no = arr[i];
			int copy = arr[i];
			int rev  = 0;
			while (no!=0)
			{
				int rem = no%10;
				rev = (rev*10)+rem;
				no=no/10;
			}
			if(copy == rev)
			{
				int noo = rev;
				int sum = 0;
				while(noo != 0)
				{
					int rem = noo%10;
					sum = sum + rem;
					noo = noo/10;
				}
				int no1 = sum;
				int sum1 = 0;
				while(no1 != 0)
				{
					int rem = no1%10;
					sum1 = sum1 +rem;
					no1 = no1/10;
				}
				int no2 = sum1;
				int sum2 = 0;
				while(no2 != 0)
				{
					int rem = no2%10;
					sum2 = sum2 + rem;
					no2 = no2/10;
				}
				int fact = 1;
				for (int j = sum2; j >= 1; j--) 
				{
					fact = fact*j;
				}
			System.out.println("fact of number "+rev+" is "+fact);
			}else{
				int no3 =arr[i];
				int copy1 = no3;
				int sum3 = 0;
				while(no3 != 0)
				{
					int rem = no3%10;
					sum3 = sum3 +rem;
					no3 = no3/10;
				}
				int no4 = sum3;
				int sum4 = 0;
				while(no4 != 0)
				{
					int rem = no4%10;
					sum4 = sum4 +rem;
					no4 = no4/10;
				}
				int fib1 = 0;
				int fib2 = 1;
				int fib3 = 0;
				for (int k = 1; k <= sum4; k++) 
				{
					fib3 = fib1+fib2;
					fib1 = fib2;
					fib2 = fib3;
				}
				System.out.println("fib of number "+copy1+" is "+fib3);
			}
		}
	}
}
