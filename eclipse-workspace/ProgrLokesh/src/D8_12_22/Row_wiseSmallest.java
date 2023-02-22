package D8_12_22;

import java.util.Scanner;

public class Row_wiseSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row elements........>");
		int row= sc.nextInt();
		System.out.println("enter the column elements...>");
		int col=sc.nextInt();
		int arrr[][]=new int [row][col];
		System.out.println("inset "+row*col+" elements");
		for (int i = 0; i < arrr.length; i++) {
			for (int j = 0; j < arrr[i].length; j++) {
				arrr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the elementss inserted are.....>");
		for (int i = 0; i < arrr.length; i++) {
			for (int j = 0; j < arrr[i].length; j++) {
				System.out.print(arrr[i][j]+" ");
			}System.out.println();
		}
		System.out.println("row wise smallest elements is...>");
		int small;
		for (int i = 0; i < arrr.length; i++) {
			small=arrr[i][0];
			for (int j = 0; j < arrr[i].length; j++) {
				if(small>arrr[i][j])
					small=arrr[i][j];
			}System.out.println(small);
		}
	}
}
