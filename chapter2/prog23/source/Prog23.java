import java.util.Scanner;

public class Prog23
{
	public static void main(String[] args)
	{
		//prompt the user to insert distance, miles per gallon
		//and price per gallon
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();

		//use the values inserted by user to calculate cost of driving
		System.out.printf("The cost of driving is $%.2f\n", (distance / milesPerGallon) * pricePerGallon);
	}
}
