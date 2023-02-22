package Methodover_ridingtype;
class Phonepy_v1
{
	void pay()
	{
		System.out.println("number pay");
	}
}
class Phonepy_v2 extends Phonepy_v1
{
	void pay()
	{
		System.out.println("pay with scanner");
		super.pay();
	}
}
public class Mainclass 
{
	public static void main(String[] args) 
	{
		Phonepy_v2 p1 = new Phonepy_v2();
		p1.pay();
	}
}
