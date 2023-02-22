package Encap;

class Icici
{
	private String pwd = "Dinga123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Customer1 {

	public static void main(String[] args) 
	{
		Icici atm_card = new Icici();
		//atm_card.pwd;
		//System.out.println(atm_card.getPwd());
		String x = atm_card.getPwd();
		System.out.println(x);
		atm_card.setPwd("Dingi@21");
		System.out.println("the new Password is > "+ atm_card.getPwd());
		
	}

}
