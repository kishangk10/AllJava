package ObjectclassHashcode;

public class Tester
{
	public int hasCode()
	{
		return 1234;
	}
	public static void main(String[] args) 
	{
		Tester t1 = new Tester();
		System.out.println(t1.hasCode());
		
		Tester t2 = new Tester();
		System.out.println(t2.hasCode());
	}
}
