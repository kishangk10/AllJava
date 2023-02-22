package LinkedList1;

import java.util.LinkedList;

public class Sample 
{
	public static void main(String[] args) 
	{
		LinkedList l1 =new LinkedList();
		l1.add(10);
		l1.add("hi");
		l1.add(27);
		l1.add(20);
		l1.add(250);
		for (int i = 0; i < l1.size(); i++) 
		{
			if(l1.get(i) == "hi")
			{
				l1.remove("hi");
				break;
			}
		}
		System.out.println(l1);
	}
}
