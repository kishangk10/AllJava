package Poly;

class Bottle
{
	void store()
	{
		System.out.println("Store liquid items");
	}
}
class Watter_bottle extends Bottle
{
	void store()
	{
		System.out.println("Store the watter");
	}
}
class Milk_bottle extends Bottle
{
	void store()
	{
		System.out.println("Store milk");
	}
}
class Juice_bottle extends Bottle
{
	void store()
	{
		System.out.println("Store Juice");
	}
}
class Storing_type
{
	static void use(Bottle b1)
	{
	
		b1.store();
	}
}
public class Mainclass1 
{
	public static void main(String[] args)
	{
		Watter_bottle w1 = new Watter_bottle();
		Milk_bottle m1 = new Milk_bottle();
		Juice_bottle j1 = new Juice_bottle();
		
		Storing_type.use(w1);
		Storing_type.use(m1);
		Storing_type.use(j1);
	}
}
