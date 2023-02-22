package MultipleInherit;

interface boda{
	int a =22222222;
}
interface baro{
	void mix();
}
public class MultipToInterface implements baro,boda {
	public void mix()
	{
		System.out.println("bond");
	}
public static void main(String[] args) {
	MultipToInterface mi = new MultipToInterface();
	mi.mix();
	System.out.println(mi.a);
}
}
