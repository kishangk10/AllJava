package ObjectclasstoString;

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
	public String toString()
	{
	return "The course name is "+course_name
			+"\n The course cost is "+exam_cost
			+"\n The unvir_name is "+unvir_name
			+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn4Cours m1 = new Assn4Cours("BE","VTU",85400);
		System.out.println(m1.toString());
		Assn4Cours m2 = new Assn4Cours("Sql","Jspiders",6000);
		System.out.println(m2.toString());		
		Assn4Cours m3 = new Assn4Cours("Java","Qspiders",15000);
		System.out.println(m3.toString());
	}
}
