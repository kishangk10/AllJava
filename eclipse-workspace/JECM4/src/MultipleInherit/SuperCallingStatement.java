package MultipleInherit;

//1
//class Mad{
//	Mad(){
//		System.out.println("hello");	
//	}
//}
//class Bad extends Mad{
//	
//}
//class Good extends Bad{
//	
//}
//class Lofer extends Good{
//	
//}



//2
//class Mad{
//	Mad(){
//		System.out.println("hello");	
//	}
//}
//class Bad extends Mad{
//public Bad() {
//	System.out.println("Mad ");
//}	
//}
//class Good extends Bad{
//	Good(){
//		System.out.println("Man ");
//	}
//}
//class Lofer extends Good{
//	Lofer(){
//		System.out.println("are you good");
//	}
//	
//}

//3
class Mad{
	Mad(int i){
		System.out.println("hello");	
	}
}
class Bad extends Mad{
public Bad(String str) {
	super(20);
	System.out.println("Mad ");
}	
}
class Good extends Bad{
	Good(int m, String s){
		super("kis");
		System.out.println("Man ");
	}
}
class Lofer extends Good{
	Lofer(String sr,int h){
		super(10,"miss");
		System.out.println("are you good");
	}
	
}
public class SuperCallingStatement
{
	public static void main(String[] args) {
		new Lofer("lola",80);
	}
}
