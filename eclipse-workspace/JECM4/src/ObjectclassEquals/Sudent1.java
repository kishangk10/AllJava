package ObjectclassEquals;

public class Sudent1 
{
	int stdid;
	Sudent1(int stid)
	{
		this.stdid=stid;
	}
	public boolean equals(Object obj)
	{
		Sudent1 s2 = (Sudent1)obj;
		return this.stdid == s2.stdid;
	}
	public static void main(String[] args) 
	{
		Sudent1 s1 = new Sudent1(20);
		Sudent1 s2 = new Sudent1(40);
		System.out.println(s1.equals(s2));
		
		Sudent1 s5 = new Sudent1(20);
		Sudent1 s6 = new Sudent1(40);
		System.out.println(s5.equals(s6));
		
		Sudent1 s3 = new Sudent1(50);
		Sudent1 s4 = s3;
		System.out.println(s3.equals(s4));
	}
}
