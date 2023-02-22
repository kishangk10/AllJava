package Encap;

class  Facebook
{
	private String pwd =  "man@10";

	public String getPwd()
	{
		return pwd;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
}

public class Customer3 
{
	public static void main(String[] args) 
	{
		Facebook f1 = new Facebook();
		System.out.println("The old password is > "+ f1.getPwd());
		f1.setPwd("women@20");
		System.out.println("The new Password is > "+ f1.getPwd());
	}
}
