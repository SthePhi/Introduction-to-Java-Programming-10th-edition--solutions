import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahren = (9 / 5.0) * celsius + 32;
		System.out.println(celsius+ " Celsius is " + fahren + " Fahrenheit");
	}
}
