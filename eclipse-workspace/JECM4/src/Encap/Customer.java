package Encap;

class Flipcart
{
	private String pwd = "Boss@123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Customer {

	public static void main(String[] args) 
	{
		Flipcart f1 = new Flipcart();
		System.out.println(f1.getPwd());
		f1.setPwd("Boss123@");
		System.out.println("The new Password is > "+f1.getPwd());
	}

}
