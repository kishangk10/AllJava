package ObjectclassEquals;

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
	public boolean equals(Object obj)
	{
		Assn8Tv a8 = (Assn8Tv)obj;
		
		return this.tv_type == a8.tv_type;
	}
	public static void main(String[] args) 
	{
		Assn8Tv m1 = new Assn8Tv(44892.46,"Panasonic","LED");
		Assn8Tv m2 = new Assn8Tv(84892.46,"Oneplus","LED");
		if(m1.equals(m2)){	
		System.out.println("The tv type is same");
		}else{
		System.out.println("The tv type is not same");
		}
	}
}
