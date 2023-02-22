package Abstraction;

interface Classroom
{
	void environment();
}
class Comic implements Classroom
{
	public void environment()
	{
		System.out.println("Comidy class");
	}
}
class Study implements Classroom
{
	public void environment()
	{
		System.out.println("Studing class");
	}
}
class Presentation implements Classroom
{
	public void environment()
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