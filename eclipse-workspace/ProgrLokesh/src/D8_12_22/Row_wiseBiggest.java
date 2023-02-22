package D8_12_22;

import java.util.Scanner;
public class Row_wiseBiggest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row elements...>  ");
		int row =sc.nextInt();
		System.out.println("enter the column elements......> ");
		int col =sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements..>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the inserted elements are......> ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println("row wise biggest....> elements ");
		int big;
		for (int i = 0; i < arr.length; i++) {
			big=arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if(big<arr[i][j])
					big=arr[i][j];
			}System.out.println(big);
		}
	}
}
