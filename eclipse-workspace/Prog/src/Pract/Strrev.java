package Pract;

import java.util.Scanner;
class Strrev
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
String str = sc.nextLine(); 
String copy = str;
String rev ="";
for(int i = str.length()-1; i>=0; i--)
{
rev = rev + str.charAt(i);
}
if(copy.equals(rev))
{
System.out.println(rev+" is palindrome");
}else{
System.out.println(rev+" is not a palindrome");
}
}
}