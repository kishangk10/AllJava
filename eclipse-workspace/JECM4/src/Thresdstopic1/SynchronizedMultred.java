package Thresdstopic1;
class SharedResorces
{
	void res()
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void res1()
	{
		for (int i = 100; i <= 110; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Sampl implements Runnable
{
	SharedResorces sr1;
	Sampl(SharedResorces sr1){
		this.sr1=sr1;
	}
	public void run()
	{
		sr1.res();
	}
}
class Dem extends Thread
{
	SharedResorces sr2;
	Dem(SharedResorces sr2){
		this.sr2=sr2;
	}
	public void run()
	{
		sr2.res1();
	}
}

public class SynchronizedMultred {
	public static void main(String[] args) {
		SharedResorces sr = new SharedResorces();
		Sampl s1= new Sampl(sr);
		Thread th1 = new Thread(s1);
		th1.start();
		
		Dem d1=new Dem(sr);
		Thread th2  = new Thread(d1);
			th2.start();
	}

}
