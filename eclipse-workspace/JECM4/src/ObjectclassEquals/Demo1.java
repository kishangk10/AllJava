package ObjectclassEquals;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Demo1 d1 =new Demo1();
		Demo1 d2 =new Demo1();
		System.out.println(d1.equals(d2));
		
		Demo1 d3 =new Demo1();
		Demo1 d4 =d3;
		System.out.println(d3.equals(d4));
	}
}
