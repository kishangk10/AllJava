package ObjectclasstoString;

public class Assn5emp 
{
	int emp_id;
	double emp_sal;
	char emp_grade;
	Assn5emp(int emp_id, double emp_sal, char emp_grade)
	{
		this.emp_id = emp_id;
		this.emp_sal = emp_sal;
		this.emp_grade = emp_grade;
	}
	public String toString()
	{
	return "The  emp id is "+emp_id
			+"\n The emp salary  is "+emp_sal
			+"\n The emp grade is "+emp_grade
			+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		Assn5emp m1 = new Assn5emp(897, 45900.69, 'A');
			System.out.println(m1.toString());
			Assn5emp m2 = new Assn5emp(899, 67800.69, 'A');
			System.out.println(m2.toString());
			Assn5emp m3 = new Assn5emp(898, 50500.69, 'A');
			System.out.println(m3.toString());
	}
}
