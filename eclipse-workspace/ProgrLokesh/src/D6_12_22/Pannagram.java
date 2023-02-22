package D6_12_22;

import java.util.HashSet;

public class Pannagram {
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		str=str.toLowerCase();
		System.out.println(str.length());
		if(str.length()>=26){
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			hashSet.add(ch);
		}
		if (hashSet.size()==26)
			System.out.println("its a panagram");
		else
			System.out.println("not a panagram");
		}else
			System.out.println("not a panagrom");
	}
}












//HashSet hashSet=new HashSet();
//String str="the quick brown fox jumps over the lazy dog";
//str=str.toLowerCase();
//if (str.length()>=26) {
//	for (int i = 0; i < str.length(); i++) {
//		char ch=str.charAt(i);
//		if (ch>='a'&&ch<='z') {
//			hashSet.add(ch);
//		}
//	}
//	if (hashSet.size()==26) 
//		System.out.println("its a panagram");
//	else
//		System.out.println("its not a panagram");
//}
//else
//	System.out.println("its not a panagram");