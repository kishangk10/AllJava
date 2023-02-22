package MultipleInherit;

class Sample
{
	Sample(int a)
	{
		System.out.println("hello");
	}
	Sample(String str)
	{
		this(10);
		System.out.println("enooo");
	}
	Sample(int i, String sr)
	{
		this("lo");
		System.out.println("Yako");
	}
	Sample(String s,int m)
	{
		this(10,"li");
		System.out.println("beka");
	}
}

public class ThiscallingStatement 
{
	public static void main(String[] args) {
		new Sample("hi",10);
	}
}
