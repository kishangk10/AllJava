package Thresdstopic1;

class SharedResource
{
	void res()
	{
		System.out.println("hi");
	}
	void res1()
	{
		System.out.println("hello");
	}
}
class Sample implements Runnable
{
	SharedResource sr1;
	Sample(SharedResource sr1) {
		this.sr1=sr1;
	}
	public void run()
	{
		sr1.res();
	}
}
class Demo extends Thread
{
	SharedResource sr2;
	Demo(SharedResource sr2) {
		this.sr2=sr2;
	}
	public void run()
	{
		
		sr2.res1();
	}
}
public class MultiInSingClass 
{
	public static void main(String[] args) 
	{
		SharedResource sr= new SharedResource();
		Sample s1 = new Sample(sr);
		Thread th1 = new Thread(s1);
		th1.run();
		
		Demo d1 = new Demo(sr);
		Thread th2=new Thread(d1);
		th2.start();
	}
}
