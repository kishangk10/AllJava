package ChekedException;

import java.util.Scanner;

class BatingPowerPlayException extends Exception
{
	String msg;
	BatingPowerPlayException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage(){
		return msg;
	}
}

public class CricketFealding {
	static void powerPlay(int players) throws BatingPowerPlayException{
		if(players <= 2)
			System.out.println("play");
		else
			throw new BatingPowerPlayException("only 2 are allowed outer circle 'no ball'");
	}
	
	public static void main(String[] args) throws BatingPowerPlayException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of players");
		int num = sc.nextInt();
		try{
		powerPlay(num);
		}catch(BatingPowerPlayException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
