package ObjectclasstoString;

public class Assn9Cloth 
{
	String cloth_colour;
	int cloth_cost;
	String cloth_size;
	Assn9Cloth(String cloth_colour, int cloth_cost, String cloth_size)
	{
		this.cloth_colour = cloth_colour;
		this.cloth_cost = cloth_cost;
		this.cloth_size = cloth_size;
	}
	public String toString()
	{
	return "The cloth colour is "+cloth_colour
			+"\n The cloth cost is "+cloth_cost
			+"\n The cloth size is "+cloth_size
			+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn9Cloth m1 = new Assn9Cloth("Black",450,"XL");
			System.out.println(m1.toString());
			Assn9Cloth m2 = new Assn9Cloth("Red",400,"XLl");
			System.out.println(m2.toString());
			Assn9Cloth m3 = new Assn9Cloth("Yellow",500,"L");
			System.out.println(m3.toString());
	}
}
