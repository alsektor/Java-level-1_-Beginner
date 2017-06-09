import java.util.Scanner;
class MainClass8
{
	public static void main(String[] args)
	{
		System.out.print("Enter name : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		printHelloName(name);
	}
	
	public static void printHelloName(String name)
	{
		System.out.printf("Hello, %s\n", name);
	}
}
