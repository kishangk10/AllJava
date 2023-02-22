package Encap;

class Gmail
{
	private int pwd=1999;
	
	public int getPwd()
	{
		return pwd;
	}
	
	public void setPwd(int pwd)
	{
		this.pwd=pwd;
	}
}
public class Customer2 
{
	public static void main(String[] args) 
	{
	Gmail g1 = new Gmail();
	int x = g1.getPwd();
	System.out.println("The old password is > "+ x);
	g1.setPwd(6293);
	System.out.println("The new password is > "+ g1.getPwd());
	}

}
