package Encap;

class Twitter
{
	private long pwd = 7799;
	
	public long getPwd()
	{
		return pwd;
	}
	
	public void setPwd(long pwd)
	{
		this.pwd = pwd ;
	}
}
public class Customer4 
{
	public static void main(String[] args) 
	{
		Twitter t1 = new Twitter();
		System.out.println("The old password is > "+ t1.getPwd());
		t1.setPwd(6969);
		System.out.println("the new password is > "+ t1.getPwd());
	}

}
