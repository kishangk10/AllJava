package Encap;

class Gpay
{
	private int upi  = 4536;

	public int getUpi() {
		return upi;
	}

	public void setUpi(int upi) 
	{
		this.upi = upi;
	}
	
}
public class Customer7
{
	public static void main(String[] args) 
	{
		Gpay g1 = new Gpay();
		System.out.println(g1.getUpi());
		g1.setUpi(6363);
		System.out.println("The new Password is > "+ g1.getUpi());
	}
}
