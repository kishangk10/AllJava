package ObjectclasstoString;

public class Assn3car
{
	double car_cost;
	String car_name;
	String car_type;
	Assn3car(double car_cost, String car_name, String car_type)
	{
		this.car_cost = car_cost;
		this.car_name = car_name;
		this.car_type = car_type;
	}
	public String toString()
	{
		return "The car cost is "+car_cost
				+"\n The car name is "+car_name
				+"\n The car type is "+car_type
				+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn3car m1 = new Assn3car(3400298.32,"Jagur","petrol");
		System.out.println(m1.toString());
		Assn3car m2 = new Assn3car(3400298.32,"Thor","petrol");
		System.out.println(m2.toString());
		Assn3car m3 = new Assn3car(3400298.32,"Hariour","Diesel");
		System.out.println(m3.toString());
	}
}
