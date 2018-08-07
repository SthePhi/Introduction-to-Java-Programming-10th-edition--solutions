import java.util.Scanner;

public class Prog17
{
	public static void main(String[] args)
	{
		//scan for temperature in fahrenheits and wind speed in miles per hour
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in fahrenheit between -58F and 41F: ");
		double a = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = input.nextDouble();

		//calculate wind chill index
		double wc = 35.74 + (0.6215 * a) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * a * Math.pow(v, 0.16));
		System.out.printf("The wind chill index is %.5f\n", wc);
	}
}
