package Interface;

interface Puma
{
	void shoes();
}
interface Nike extends Puma
{
	void bags();	
}
class Max implements Nike
{
public	void bags()
	{
		System.out.println("Super");
	}
public	void shoes()
	{
		System.out.println("OK");
	}
}
public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Max m1 = new Max();
		m1.bags();
		m1.shoes();
	}
}
