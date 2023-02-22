package mock1;

public class Sample1 
{
	public static void main(String[] args) 
	{
		String str = "gadg";
		String rev = "";
		for (int i = str.length()-1;i >= 0; i++) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
