package ObjectclassEquals;

public class Assn1Mobile 
{
	int mob_cost;
	String mob_name;
	String mob_colour;
	Assn1Mobile(int mob_cost, String mob_name, String mob_colour)
	{
		this.mob_colour=mob_colour;
		this.mob_name=mob_name;
		this.mob_colour=mob_colour;
	}
	public boolean equals(Object obj)
	{
		Assn1Mobile a2 = (Assn1Mobile)obj;
								//if we write the && all the condition shoud be satisfide
								//if we write the || if one condition satisfide it will prints
		return ((this.mob_colour == a2.mob_colour) || (this.mob_cost == a2.mob_cost) || 
				(this.mob_name == a2.mob_name));
	}
	public static void main(String[] args) 
	{
		Assn1Mobile a1 = new Assn1Mobile(33000, "Oneplus", "Black");
		Assn1Mobile a2 = new Assn1Mobile(70000, "Iphone", "Black");
		System.out.println(a1.equals(a2));
		//if(a1.equals(a2))
		//{
			//System.out.println("The colour is same ");
		//}else{
		//	System.out.println("The colour is not same");
		//}
	}
}
