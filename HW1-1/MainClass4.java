import java.util.Scanner;
public class MainClass4{
static int a;
static int b;
public static void main ( String[]args )
	{
askNum();
boolean g=isTrue(a,b);
if (g) {
System.out.println("cумма "+a+"+"+b+"="+(a+b)+", i eto popadaet v diapazon ot 10 do 20");
}else {
System.out.println ("cумма "+a+"+"+b+"="+(a+b)+", i eto ne popadaet v diapazon ot 10 do 20");
}
}
static boolean isTrue(int a, int b){
int c= a+b;
if (c>10 && c<=20){
return true;
}else{
return false;
}
}
static void askNum(){
System.out.println("Vvedite a");
Scanner scanner = new Scanner(System.in) ; a = scanner.nextInt();
System.out.println("Vvedite b");
b = scanner.nextInt();
}
}