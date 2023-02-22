package D6_12_22;

import java.util.Scanner;

public class DynamicMulti {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the row elements ");
		int row=scanner.nextInt();
		System.out.println("enter the column elements ");
		int col=scanner.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements  ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("after loaded... ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
