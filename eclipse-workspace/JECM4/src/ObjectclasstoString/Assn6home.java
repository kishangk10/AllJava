package ObjectclasstoString;

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
	public String toString()
	{
	return "The  home name is "+home_name
			+"\n The home cost  is "+home_cost
			+"\n The home colour is "+home_colour
			+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn6home m1 = new Assn6home("Belaku",2049854.96,"White");
			System.out.println(m1.toString());
			Assn6home m2 = new Assn6home("Shubodaya",1586378,"blue");
			System.out.println(m2.toString());
			Assn6home m3 = new Assn6home("rad",3049854.96,"green");
			System.out.println(m3.toString());
	}
}
