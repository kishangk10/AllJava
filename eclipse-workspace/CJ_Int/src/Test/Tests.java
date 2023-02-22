package Test;

import java.util.Iterator;

public class Tests {
	public static void main(String[] args) {
		        String input = "abcdeedcba";
		        String output = removeDuplicates(input);
		        System.out.println("Input String : " + input);
		        System.out.println("Output String : " + output);
		    }

		    public static String removeDuplicates(String input) {
		        StringBuilder output = new StringBuilder();
		        for (int i = 0; i < input.length(); i++) {
		            char currentChar = input.charAt(i);
		            if (output.toString().indexOf(currentChar) < 0) {
		                output.append(currentChar);
		            }
		        }
		        return output.toString();

	}
}
