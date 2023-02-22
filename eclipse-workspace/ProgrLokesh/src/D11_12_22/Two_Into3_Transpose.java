package D11_12_22;
import java.util.Scanner;
public class Two_Into3_Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows size ....>> ");
		int row=sc.nextInt();
		System.out.println("enter the column size ....>>");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements....>>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("inserted elements are  ....>> ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		int ans[][] = null;
		if(arr.length==arr[0].length){
			ans=new int[arr.length][arr[0].length];
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[i].length; j++) {
					ans[i][j]=arr[j][i];
				}
			}
		}
		else if(arr.length < arr[0].length || arr.length > arr[0].length){
//							4				3
			ans=new int[arr[0].length][arr.length];
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[i].length; j++) {
					ans[i][j]=arr[j][i];
				}
			}
		}
		System.out.println("transposed out put is ....>> ");
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}System.out.println();
		}
	}
}


// o/p

//	enter the rows size ....>> 
//			3
//			enter the column size ....>>
//				4
//				enter 12 elements....>>
//				1
//				2
//				3
//				4
//				5
//				6
//				7
//				8
//				9
//				10
//				11
//				12
//				inserted elements are  ....>> 
//			1 2 3 4 
//			5 6 7 8 
//			9 10 11 12 
//
//			3
//			4
//
//			transposed out put is ....>> 
//			1 5 9 
//			2 6 10 
//			3 7 11 
//			4 8 12 