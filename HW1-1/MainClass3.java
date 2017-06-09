import java.util.Scanner;
public class MainClass3{
public static int addTwoNumbers (int a,int b,int c, int d){
return a*(b+(c/d));}
	public static void main ( String[]args )
{
int a;
int b;
int c;
int d;
Scanner sc = new Scanner(System.in) ; a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
d = sc.nextInt();
System.out.println(addTwoNumbers(a,b,c,d));

}
}