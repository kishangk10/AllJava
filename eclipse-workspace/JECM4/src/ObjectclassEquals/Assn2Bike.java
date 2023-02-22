package ObjectclassEquals;

public class Assn2Bike
{
	int bike_cost;
	String bike_brand;
	String bike_colour;
	Assn2Bike(int bike_cost, String bike_brand, String bike_colour)
	{
		this.bike_cost = bike_cost;
		this.bike_brand = bike_brand;
		this.bike_colour = bike_colour;
	}
	public boolean equals(Object obj)
	{
		Assn2Bike a3 = (Assn2Bike)obj;
		
		return this.bike_cost == a3.bike_cost;
	}
	public static void main(String[] args) 
	{
		Assn2Bike a1 = new Assn2Bike(230000, "Dominar", "Black");
		Assn2Bike a2 = new Assn2Bike(396087, "Continental G T", "Silver");
		if(a2.equals(a1))
		{
			System.out.println("The Bike colour is Same ");
		}else{
			System.out.println("The Bike colour is not Same ");
		}
	}
}
