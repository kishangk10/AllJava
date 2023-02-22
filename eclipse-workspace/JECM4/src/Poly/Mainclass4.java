package Poly;

class Cloth
{
	void Design()
	{
		System.out.println("Making the Design of the Cloth");
	}
}
class Shirt extends Cloth
{
	void Design()
	{
		System.out.println("Shirt Design");
	}
}
class Tshirt extends Cloth
{
	void Design()
	{
		System.out.println("Tshirt Design");
	}
}
class Pant extends Cloth
{
	void Design()
	{
		System.out.println("Pant Design");
	}
}
class Industry
{
	static void Manufacture(Cloth g1)
	{
	
		g1.Design();
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		Shirt s1 = new Shirt();
		Tshirt t1 = new Tshirt();
		Pant p1 = new Pant();
		
		Industry.Manufacture(s1);
		Industry.Manufacture(t1);
		Industry.Manufacture(p1);
	}
}