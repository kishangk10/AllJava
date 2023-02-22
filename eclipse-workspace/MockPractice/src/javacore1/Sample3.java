package javacore1;

import java.util.ArrayList;
import java.util.Vector;

public class Sample3
{
	public static void main(String[] args) 
	{
		//ArrayList l1 =new ArrayList();
		Vector l1 = new Vector();
 		l1.add(10);
		l1.add("hi");
		l1.add(20.56);
		l1.add(2);
//		for (int i = 0; i < l1.size(); i++) {
//			Object o1 = l1.get(i);
//			System.out.println(i+" "+ o1);
//		}
		System.out.println(l1.size());
		System.out.println(l1.capacity());
		
		ArrayList l2=new ArrayList(l1);
		l2.add('a');
		l2.add('b');
		l2.add('c');
		System.out.println(l2);
	}
}
