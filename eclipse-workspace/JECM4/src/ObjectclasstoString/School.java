package ObjectclasstoString;

public class School 
{
	String sc_name;
	int sc_noofstd;
	char sc_grade;
	School(String sc_name,int sc_noofstd,char sc_grade)
	{
		this.sc_name = sc_name;
		this.sc_noofstd = sc_noofstd;
		this.sc_grade = sc_grade;
	}
	public String toString()
	{
		return "The School name is "+sc_name
				+"\n The School Stringth is "+sc_noofstd
				+"\n The School grade is "+sc_grade
				+"\n**********************************";
	}
	public static void main(String[] args) 
	{
		School s1 = new School("sjc",5000,'a');
		System.out.println(s1.toString());
		School s2 = new School("Singuva",4000,'b');
		System.out.println(s2.toString());
		School s3 = new School("Muchkova",800,'c');
		System.out.println(s3.toString());
	}
}
