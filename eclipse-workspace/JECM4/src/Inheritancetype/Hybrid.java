package Inheritancetype;
class Tester1
{
	int a = 40;
}
class Demo1 extends Tester1
{
	void pg()
	{
		System.out.println("One ladyes pg");
	}
}
class Sample1 extends Demo1
{
	void pgs()
	{
		System.out.println("One Boy pg");
	}
}
class Hal1 extends Tester1
{
	void site()
	{
	System.out.println("One site");
	}
}
public class Hybrid 
{
	public static void main(String[] args) 
	{
	Sample1 s1 = new Sample1();
	System.out.println(s1.a);
	s1.pgs();
	s1.pg();
	
	Hal1 h1 = new Hal1();
	System.out.println(h1.a);
	h1.site();
	}
}
