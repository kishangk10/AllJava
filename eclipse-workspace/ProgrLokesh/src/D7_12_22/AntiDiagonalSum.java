package D7_12_22;

import java.util.Scanner;

public class AntiDiagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row elements.....>");
		int row=sc.nextInt();
		System.out.println("enter the column elements.....>");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements...>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the inserted elements are.......>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i+j==arr.length-1)
				sum+=arr[i][j];
			}
		}System.out.println(sum);
	}
}
