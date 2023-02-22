package ObjectclassEquals;

public class Emp 
{
	int emp_id;
	String emp_name;
	double emp_sal;
	Emp(int emp_id, String emp_name, double emp_sal)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	public boolean equals(Object obj)
	{
		Emp e2 = (Emp)obj;
		
		return this.emp_sal == e2.emp_sal;
	}
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(89,"Dinga",30000.56);
		Emp e2 = new Emp(90,"Dingi",30000.56);
		if(e1.equals(e2))
		{
			System.out.println("The Salary is same ");
		}else{
			System.out.println("The Salary is not same ");
		}
	}
}
