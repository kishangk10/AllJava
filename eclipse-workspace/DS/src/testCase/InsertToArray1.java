package testCase;

import java.util.Arrays;

public class InsertToArray1 {

	static void array(int[] arr1, int[] arr2) {
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				arr1[i] = arr2[j];
				j++;
			}
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 4, 6, 5 };
		array(arr1, arr2);
	}
}
