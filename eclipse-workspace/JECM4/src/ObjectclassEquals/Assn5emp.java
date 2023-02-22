package ObjectclassEquals;

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
	public boolean equals(Object obj)
	{
		Assn5emp a5 = (Assn5emp)obj;
		
	return  this.emp_grade == a5.emp_grade;
	}
	public static void main(String[] args) 
	{
		Assn5emp m1 = new Assn5emp(897, 45900.69, 'A');
		Assn5emp m2 = new Assn5emp(899, 67800.69, 'A');
		if(m1.equals(m2)){
			System.out.println("The grade of employ is same ");
		}else{
			System.out.println("The grade of employ is not same ");
		}
	}
}
