package D8_12_22;

import java.util.Scanner;

public class TransposeMstrix extends Object{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row .......> ");
		int row=sc.nextInt();
		System.out.println("enter the column .........>	 ");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the inserted elements.....>	 ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				}System.out.println();
		}
		System.out.println("the transpose of the matrix is ...........>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}
		
				
//					OR
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the row .......> ");
//		int row=sc.nextInt();
//		System.out.println("enter the column .........>	 ");
//		int col=sc.nextInt();
//		int arr[][]=new int[row][col];
//		System.out.println("enter "+row*col+" elements");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("the inserted elements.....>	 ");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//				}System.out.println();
//		}
//		int ans[][]=new int[row][col];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				ans[i][j]=arr[j][i];
//			}
//		}
//		System.out.println("the transposed elements are........>");
//		for (int i = 0; i < ans.length; i++) {
//			for (int j = 0; j < ans[i].length; j++) {
//				System.out.print(ans[i][j]+" ");
//			}System.out.println();
//		}
	}
}
