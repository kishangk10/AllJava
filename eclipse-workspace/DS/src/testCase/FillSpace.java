package testCase;

public class FillSpace {
	
	static void replace1(String str) {
		System.out.println(str);
		String s2=str.replaceAll(" +", "@40");
		StringBuilder ans=new StringBuilder();
		ans.append(s2);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		String str1="I   am   Java";
		replace1(str1);
	}
}
