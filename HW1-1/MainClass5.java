import java.util.Scanner;
public class MainClass5{
static int a;
public static void main ( String[]args )
{
askNum();
if (a>0) {
System.out.println("vashe chislo polozhitelnoe");
}else {
System.out.println ("vashe chislo otricatelnoe");
}
}
static void askNum(){
System.out.println("Vvedite lyboe chislo");
Scanner scanner = new Scanner(System.in) ; a = scanner.nextInt();
}
}