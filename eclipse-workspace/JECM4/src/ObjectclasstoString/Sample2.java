package ObjectclasstoString;

public class Sample2 
{
	int emp_id = 123;
	String Emp_name = "Dinga";
	public String toString()
	{
		return "The emp id is "+emp_id+"\n The Emp name is "+Emp_name;
	}
	public static void main(String[] args) 
	{
		Sample2 s1 = new Sample2();
		System.out.println(s1.toString());
	}

}
