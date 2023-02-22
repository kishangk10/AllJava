package classtype_casting;
class Tester1
{
	void cool()
	{
		
		System.out.println("Hello");
	}
}
class Demo1 extends Tester1
{
	int y = 100;
}
public class Tesdem 
{
	public static void main(String[] args) 
	{
		Tester1 t1 = new Demo1();
		t1.cool();
		Demo1 d1 =(Demo1)t1;
		d1.cool();
		System.out.println(d1.y);
	}
}
