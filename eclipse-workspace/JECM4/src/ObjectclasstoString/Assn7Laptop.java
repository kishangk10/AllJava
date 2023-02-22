package ObjectclasstoString;

public class Assn7Laptop 
{
	String lap_name;
	double lap_cost;
	String lap_brand;
	Assn7Laptop(String home_colour, double lap_cost, String lap_brand)
	{
		this.lap_name = home_colour;
		this.lap_cost = lap_cost;
		this.lap_brand = lap_brand;
	}
	public String toString()
	{
		return "The Laptop name is "+lap_name
				+"\n The lap_cost is "+lap_cost
				+"\n The Lap_brand is "+lap_brand
				+"\n ****************************";
	}
	public static void main(String[] args) 
	{
		Assn7Laptop m1 = new Assn7Laptop("Dell",32400.85,"core i3");
			System.out.println(m1.toString());
			Assn7Laptop m2 = new Assn7Laptop("hp",42400.85,"core i5");
			System.out.println(m2.toString());
			Assn7Laptop m3 = new Assn7Laptop("Lenova",52400.85,"core i7");
			System.out.println(m3.toString());
	}
}
