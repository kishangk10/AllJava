package HashSet1;

import java.util.HashSet;

public class Sample1Add 
{
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add("hi");
		h1.add('h');
		h1.add(50);
		h1.add(30);
		h1.add(10);
		System.out.println(h1);
		
		HashSet h2 = new HashSet();
		h2.add(50);
		h2.add("hik");
		h2.add('l');
		h2.add(70);
		h2.add(100);
		h2.add(50);
		System.out.println(h1.addAll(h2));
		System.out.println(h2);
		System.out.println(h1);
	}
}
