package ObjectclassEquals;

public class Assn4Cours 
{
	String course_name;
	String unvir_name;
	double exam_cost;
	Assn4Cours(String course_name, String unvir_name, double exam_cost)
	{
		this.course_name = course_name;
		this.unvir_name = unvir_name;
		this.exam_cost = exam_cost;
	}
	public boolean equals(Object obj)
	{
		Assn4Cours a3 = (Assn4Cours)obj;
		
		return this.course_name == a3.course_name;
	}
	public static void main(String[] args) 
	{
		Assn4Cours m1 = new Assn4Cours("BE","VTU",85400);
		Assn4Cours m2 = new Assn4Cours("Sql","Jspiders",6000);
		if(m1.equals(m2))
		{
		System.out.println("The course name is same");		
		}else{
		System.out.println("The course name is not Same");
		}
	}
}
