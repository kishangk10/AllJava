package D9_12_22;

import java.util.Scanner;

public class LargestElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size....>");
		int row=sc.nextInt();
		System.out.println("enter the column size..>");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter the no of elements into matrix "+row*col);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the inserted elements are >>>>>...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		int big=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(big<arr[i][j])
					big=arr[i][j];
			}
		}System.out.println("the biggest element in the matrix is "+
			"\n ------>> "+big);
	}
}
