package Interface;

interface Whatsapp
{
	void message();
	void pay();
}
abstract class Mobile implements Whatsapp
{
	public void message()
	{
		System.out.println("Message with Friends");
	}
}
class Mobile1 extends Mobile
{
	public void pay()
	{
		System.out.println("Scan and Pay");
	}
}
public class Mainclass3 
{
	public static void main(String[] args) 
	{
	Mobile1 m1 = new Mobile1();
	m1.message();
	m1.pay();
	}

}
