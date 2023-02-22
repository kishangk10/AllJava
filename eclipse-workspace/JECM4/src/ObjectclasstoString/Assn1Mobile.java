package ObjectclasstoString;

public class Assn1Mobile
{
	int mobile_cost;
	String model_name;
	String mobile_colour;
	Assn1Mobile(int mobile_cost,String model_name,String mobile_colour)
	{
		this.mobile_cost = mobile_cost;
		this.model_name = model_name;
		this.mobile_colour = mobile_colour;
	}
	public String toString()
	{
		return "The mobile cost is "+mobile_cost
				+"\n The mobile name is "+model_name
				+"\n The mobile colour is "+mobile_colour
				+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn1Mobile s1 = new Assn1Mobile(44000,"Oneplus 10R","Black");
		System.out.println(s1.toString());
		Assn1Mobile s2 = new Assn1Mobile(69000,"iphone","Black");
		System.out.println(s2.toString());
		Assn1Mobile s3 = new Assn1Mobile(29000,"Oneplus nord","Blue");
		System.out.println(s3.toString());
	}
}
