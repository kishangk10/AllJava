package extendstype;
abstract class Sample1
{
	abstract void test();
	abstract void disp();
}
abstract class Demo1 extends Sample1
{
	void test()
	{
		System.out.println("hi");
	}
}
public class Tester1 extends Demo1
{
	void disp()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		Tester1 t1= new Tester1();
		t1.disp();
		t1.test();
	}

}
