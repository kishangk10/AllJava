package Poly;

class Human
{
	void emotion()
	{
		System.out.println("tense");
	}
}
class Angry extends Human
{
	void emotion()
	{
		System.out.println("Angry");
	}
}
class Happy extends Human
{
	void emotion()
	{
		System.out.println("Happy");
	}
}
class Sad extends Human
{
	void emotion()
	{
		System.out.println("Sad");
	}
}
class Sitution
{
	static void react(Human g1)
	{
	
		g1.emotion();
	}
}
public class Mainclass 
{
	public static void main(String[] args)
	{
		Angry a1 = new Angry();
		Happy h1 = new Happy();
		Sad s1 = new Sad();
		
		Sitution.react(a1);
		Sitution.react(h1);
		Sitution.react(s1);
	}
}
