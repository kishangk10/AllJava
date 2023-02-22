package D6_11_22_testcases;

import java.util.Scanner;
public class SleepIn 
{
	public boolean sleepin(boolean weekDay,boolean vacation)
	{
		if(weekDay == false || vacation == true)
		{
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the 1st i/p ");
		boolean weekDay = sc.nextBoolean();
		boolean vacation = sc.nextBoolean();
		System.out.print("enter the 2nd i/p ");
		boolean weekDay1 = sc.nextBoolean();
		boolean vacation1 = sc.nextBoolean();
		System.out.print("enter the 3rd i/p ");
		boolean weekDay2 = sc.nextBoolean();
		boolean vacation2 = sc.nextBoolean();
		SleepIn s1 = new SleepIn();
		System.out.println(s1.sleepin(weekDay, vacation));
		System.out.println(s1.sleepin(weekDay1, vacation1));
		System.out.println(s1.sleepin(weekDay2, vacation2));
	}
}
