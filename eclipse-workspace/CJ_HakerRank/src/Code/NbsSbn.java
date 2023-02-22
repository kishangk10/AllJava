package Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NbsSbn {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double d=scan.nextDouble();
        System.out.println();
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
       BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
       
        String s=bufferedReader.readLine();
System.out.println(s);
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + j);
	}

}
