package ObjectclasstoString;

public class Assn2Bike 
{
	double bike_cost;
	String bike_brand;
	String bike_colour;
	Assn2Bike(double bike_cost, String bike_brand, String bike_colour)
	{
		this.bike_cost = bike_cost;
		this.bike_brand = bike_brand;
		this.bike_colour = bike_colour;
	}
	public String toString()
	{
		return "The bike cost is "+bike_cost
				+"\n The bike name is "+bike_brand
				+"\n The bike colour is "+bike_colour
				+"\n**********************************";
	}
	public static void main(String[] args) 
	{
			Assn2Bike m1 = new Assn2Bike(396856.85,"Continental G T","Sliver");
			System.out.println(m1.toString());
			Assn2Bike m2 = new Assn2Bike(135000,"tvs rider","Red");
			System.out.println(m2.toString());
			Assn2Bike m3 = new Assn2Bike(19000,"xpulse","Red");
			System.out.println(m3.toString());
	}
}
