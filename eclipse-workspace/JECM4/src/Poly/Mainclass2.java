package Poly;

class Mobile
{
	void operation()
	{
		System.out.println("Communication Media");
	}
}
class Vedio_player extends Mobile
{
	void operation()
	{
		System.out.println("Play the Video");
	}
}
class Audio_player extends Mobile
{
	void operation()
	{
		System.out.println("Play the audio");
	}
}
class Gaming_tool extends Mobile
{
	void operation()
	{
		System.out.println("Play the game");
	}
}
class User
{
	static void usage(Mobile g1)
	{
	
		g1.operation();
	}
}
public class Mainclass2 
{
	public static void main(String[] args)
	{
		Vedio_player v1 = new Vedio_player();
		Audio_player a1 = new Audio_player();
		Gaming_tool g1 = new Gaming_tool();
		
		User.usage(v1);
		User.usage(a1);
		User.usage(g1);
	}
}