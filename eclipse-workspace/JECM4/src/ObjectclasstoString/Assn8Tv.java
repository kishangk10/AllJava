package ObjectclasstoString;

public class Assn8Tv
{
	double tv_cost;
	String tv_brand;
	String tv_type;
	Assn8Tv(double tv_cost, String tv_brand, String tv_type)
	{
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}
	public String toString()
	{
		return "The tv cost is "+tv_cost
				+"\n The tv brand is "+tv_brand
				+"\n The tv type is "+tv_type
				+"\n ****************************";
	}
	public static void main(String[] args) 
	{
		Assn8Tv m1 = new Assn8Tv(44892.46,"Panasonic","LED");
			System.out.println(m1.toString());
			Assn8Tv m2 = new Assn8Tv(84892.46,"Oneplus","LED");
			System.out.println(m2.toString());
			Assn8Tv m3 = new Assn8Tv(34892.46,"LG","LED");
			System.out.println(m3.toString());
	}
}
