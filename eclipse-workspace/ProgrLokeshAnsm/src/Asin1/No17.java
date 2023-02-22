package Asin1;

public class No17 
{
	public static void main(String[] args) {
		int[] arr={10,7,11,21,15,47};
		int sum = 0;
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j < arr.length; j++) {
				if(arr[j] % arr[i] == 0)
					sum=sum+arr[i];
			System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
