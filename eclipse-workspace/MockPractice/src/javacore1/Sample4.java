package javacore1;

import java.util.ArrayList;

public class Sample4
{
	public static void main(String[] args) 
	{
		ArrayList l1 =new ArrayList();
		l1.add(40);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList();
		l2.add(50);
		l2.add(60);
		l2.add(40);
		l2.add(30);
		System.out.println(l2);
		System.out.println();
		l1.retainAll(l2);
		System.out.println(l1);

		
	}
}
