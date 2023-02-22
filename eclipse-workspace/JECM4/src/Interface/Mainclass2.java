package Interface;

interface Gpay 
{
	void pay();
}
interface Phonepe extends Gpay
{
	void scanpay();
}
abstract class Onlinepay implements Phonepe
{
	public void scanpay()
	{
		System.out.println("Gift vochers");
	}
}
class Onlinepay1 extends Onlinepay
{
	public void pay()
	{
		System.out.println("50% Cash back");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Onlinepay1 o1 = new Onlinepay1();
		o1.pay();
		o1.scanpay();
	}
}