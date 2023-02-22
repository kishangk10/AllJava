package Interface;

interface Demo
{
	void add();
}
class Sample implements Demo
{
	public void add()
	{
		System.out.println("Hello");
	}
}
public class Mainclass 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.add();
	}

}
