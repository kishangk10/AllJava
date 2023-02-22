package Encap;

class Sbi
{
	private long no = 911047999;
	
	public long getNo()
	{
		return no;
	}
	
	public void setPwd(long no)
	{
		this.no=no;
	}
}

public class Customer5 {

	public static void main(String[] args) 
	{
		Sbi s1 =new Sbi();
		System.out.println(s1.getNo());
		s1.setPwd(636058102);
		System.out.println("The new number is > "+s1.getNo());
	}

}
