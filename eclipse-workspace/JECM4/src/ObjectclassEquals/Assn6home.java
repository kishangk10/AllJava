package ObjectclassEquals;

public class Assn6home
{
	String home_name;
	double home_cost;
	String home_colour;
	Assn6home(String home_name, double home_cost, String home_colour)
	{
		this.home_name = home_name;
		this.home_cost = home_cost;
		this.home_colour = home_colour;
	}
	public boolean equals(Object obj)
	{
		Assn6home a6 = (Assn6home)obj;
		
		return this.home_colour == a6.home_colour;
	}
	public static void main(String[] args) 
	{
		Assn6home m1 = new Assn6home("Belaku",2049854.96,"White");
		Assn6home m2 = new Assn6home("Shubodaya",1586378,"blue");
		if(m1.equals(m2)){
		System.out.println("The colour is same ");
		}else{
		System.out.println("The colour i not same ");
		}
	}
}
