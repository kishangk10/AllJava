package ObjectclassEquals;

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
	public boolean equals(Object obj)
	{
		Assn3car a3 = (Assn3car)obj;
		
		return this.car_type == a3.car_type;
	}
	public static void main(String[] args) 
	{
		Assn3car m1 = new Assn3car(3400298.32,"Jagur","petrol");
		Assn3car m2 = new Assn3car(3400298.32,"Thor","petrol");
		if(m1.equals(m2))
		{
		System.out.println("The car type is same ");
		}else{
		System.out.println("The Car type is not same ");
		}
	}
}
