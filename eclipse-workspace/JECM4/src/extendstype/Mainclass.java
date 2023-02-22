package extendstype;

abstract class Sample
{
abstract void disp();
abstract void test();
}
class Demo extends Sample
{
	void disp()
	{
		System.out.println("Hello");
	}
	void test()
	{
		System.out.println("hi");
	}
}
public class Mainclass 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.disp();
		d1.test();
	}
}
