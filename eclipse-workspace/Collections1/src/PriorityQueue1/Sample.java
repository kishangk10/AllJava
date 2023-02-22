package PriorityQueue1;

import java.util.PriorityQueue;

public class Sample 
{
	public static void main(String[] args) 
	{
		PriorityQueue o1 = new PriorityQueue();
		o1.add(10);
		o1.add(60);
		o1.add(20);
		o1.add(50);
		System.out.println(o1);
		
		PriorityQueue o2 = new PriorityQueue();
		o2.add(60);
		o2.add(50);
		o2.add(120);
		o2.add(100);
		System.out.println(o2);
		
		System.out.println(o2.remove(120));
		System.out.println(o2);
		
		for (int i = 0; i < o2.size(); i++) 
		{
		o2.remove(60);	
		break;
		}
		System.out.println(o2);
	}

}