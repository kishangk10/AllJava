package ObjectclassHashcode;

public class Sample 
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		System.out.println(s1.hashCode());
		Sample s2 = new Sample();
		System.out.println(s2.hashCode());
		Sample s3 = new Sample();
		System.out.println(s3.hashCode());
	}
}
