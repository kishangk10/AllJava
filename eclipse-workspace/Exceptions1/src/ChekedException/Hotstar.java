package ChekedException;

import java.util.Scanner;

class UpgradetheplanException extends Exception
{
	String msg;
	UpgradetheplanException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
public class Hotstar {
	static void pack(int no) throws UpgradetheplanException
	{
		if(no <= 1)
			System.out.println("you can watch");
		else
			throw new UpgradetheplanException("you are havin basic paln upgrade the plan"
					+ "\n (or) logout from all user");
	}
	public static void main(String[] args) throws UpgradetheplanException {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the users");
		int no = sc.nextInt();
		try{
		pack(no);
		}catch(UpgradetheplanException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
