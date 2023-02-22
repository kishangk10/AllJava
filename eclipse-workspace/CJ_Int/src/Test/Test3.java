package Test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 7, 8, 9, 12, 15};
        int[] output = findMissingNumbers(input);
        System.out.println("Input Array : " + Arrays.toString(input));
        System.out.println("Missing Numbers : " + Arrays.toString(output));
    }

    public static int[] findMissingNumbers(int[] input) {
        int max = input[input.length - 1];
        int[] temp = new int[max + 1];
        for (int i = 0; i < input.length; i++) {
            temp[input[i]] = 1;
        }
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (temp[i] == 0) {
                count++;
            }
        }
        int[] output = new int[count];
        int j = 0;
        for (int i = 1; i <= max; i++) {
            if (temp[i] == 0) {
                output[j++] = i;
            }
        }
        return output;
    }
}
