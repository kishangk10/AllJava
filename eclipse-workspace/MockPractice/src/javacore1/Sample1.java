package javacore1;

public class Sample1 
{
//	public int hashCode()
//	{
//		return 123;
//	}
	public static void main(String[] args)
	{
		Sample1 s1 = new Sample1();
		System.out.println(s1.hashCode());
		
		Sample1 s2 = new Sample1();
		System.out.println(s2.hashCode());
	}
}
