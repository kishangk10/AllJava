package D9_12_22;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row count..........>>");
	int row=sc.nextInt();
	System.out.println("enter the column count....>>");
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	System.out.println("enter "+row*col+" elements");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("the inserted elements are ...>");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
	int small=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			small=arr[i][j];
		}
	}System.out.println("the smallest elemnets is >> "+small);
	}
}