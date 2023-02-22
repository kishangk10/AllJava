package Pract;
import java.util.Scanner;
class Revno
{
static void rev(int no)
{
int copy = no;
int rev = 0;
while(no!=0)
{
int rem = no % 10;
rev = (rev*10)+rem;
no=no/10;
}
System.out.println(rev);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
rev(no);
}
}
