package D2_12_22;

import java.util.Scanner;

public class SumFirst3Digits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbers.....>");
		int n=sc.nextInt();
		int sum=0;
		
//		String str=Integer.toString(n);
//		System.out.println(str);
//		for (int i = 0; i < 3; i++) {
//			char ch=str.charAt(i);
//			sum+=(int)(ch-48);
//		}
//		System.out.println(sum);
		
		while(n!=0){
			if(n<999)
				sum=sum+n%10;
			n=n/10;
		}System.out.println(sum);
	}
}


//o/p
//1593145
//15