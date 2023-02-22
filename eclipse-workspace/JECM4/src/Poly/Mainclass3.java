package Poly;

class Classroom
{
	void environment()
	{
		System.out.println("We use classroom to get the Knoledge ");
	}
}
class Comic extends Classroom
{
	void environment()
	{
		System.out.println("Comidy class");
	}
}
class Study extends Classroom
{
	void environment()
	{
		System.out.println("Studing class");
	}
}
class Presentation extends Classroom
{
	void environment()
	{
		System.out.println("Presentation class");
	}
}
class Students
{
	static void behaviour(Classroom g1)
	{
	
		g1.environment();
	}
}
public class Mainclass3 
{
	public static void main(String[] args)
	{
		Comic c1 = new Comic();
		Study s1 = new Study();
		Presentation p1 = new Presentation();
		
		Students.behaviour(c1);
		Students.behaviour(s1);
		Students.behaviour(p1);
	}
}