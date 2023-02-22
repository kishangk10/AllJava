package ObjectclassEquals;

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
	public boolean equals(Object obj)
	{
		Assn9Cloth a9 = (Assn9Cloth)obj;
		
	return this.cloth_size == a9.cloth_size;
	}
	public static void main(String[] args) 
	{
		Assn9Cloth m1 = new Assn9Cloth("Black",450,"XL");
		Assn9Cloth m2 = new Assn9Cloth("Red",400,"XLL");
		if(m1.equals(m2)){
		System.out.println("The cloth size is same ");
		}else
		System.out.println("The cloth size is not same ");
	}
}

