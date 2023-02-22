package ObjectclassEquals;

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
	public boolean equals(Object obj)
	{
		Assn7Laptop a7 = (Assn7Laptop)obj;
		
		return this.lap_brand == a7.lap_brand;
	}
	public static void main(String[] args) 
	{
		Assn7Laptop m1 = new Assn7Laptop("Dell",32400.85,"core i3");
		Assn7Laptop m2 = new Assn7Laptop("hp",42400.85,"core i3");
		if(m1.equals(m2)){
		System.out.println("The laptop brand is same ");
		}else{
		System.out.println("The laptop brand is not same ");
		}
	}
}
