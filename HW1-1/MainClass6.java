/*import java.util.Scanner;
public class MainClass6{
static int a;
public static void main ( String[]args )
{
System.out.println("Vvedite lyboe chislo");
Scanner scanner = new Scanner(System.in) ; a = scanner.nextInt();
if (a<0) { System.out.println("negativ"); 
}else { System.out.println("positive");
}
}
}*/
/*import java.util.Scanner;
public class MainClass6
{
	public static void main ( String[]args )
	{
		static int a;
		System.out.println("Vvedite a");
		Scanner scanner = new Scanner(System.in) ; a = scanner.nextInt();
	}
	public static boolean isTrue(int a)
	if (a<0){
	return true;
} */
import java.util.Scanner;
class MainClass6
{
	public static void main(String... args)
	{
		int variable;
		System.out.println("Vvedite variable");
		Scanner scanner = new Scanner(System.in) ; variable = scanner.nextInt();
		if (!getPositiveOrNegative(variable))
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
	
	public static boolean getPositiveOrNegative(int variable)
	{
		if (variable < 0)
			return true;
		return false;
	}
}