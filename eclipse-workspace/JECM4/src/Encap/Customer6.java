package Encap;

class Insta
{
	private String pwd  = "Dabba@123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class Customer6
{
	public static void main(String[] args) 
	{
		Insta i1 = new Insta();
		System.out.println(i1.getPwd());
		i1.setPwd("Fello@1234");
		System.out.println("The new Password is > "+ i1.getPwd());
	}
}
