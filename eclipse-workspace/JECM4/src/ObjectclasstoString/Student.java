package ObjectclasstoString;

public class Student 
{
	String st_name;
	int st_id;
	Student(String st_name,int st_id)
	{
		this.st_name = st_name;
		this.st_id = st_id;
	}
	public String toString()
	{
		return "The Student name is "+st_name+"\n The student id is "+st_id;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("Dinga",789);
		System.out.println(s1.toString());
	}
}
