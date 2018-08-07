import java.util.Scanner;

public class Prog14
{
	public static void main(String[] args)
	{
		//scan for weigth in pounds and height in inches
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();

		//calculate BMI ,but first convert weight in pounds to kilogroms
		//and height in inches to meters
		double bmi = (weightInPounds * 0.45359237) / Math.pow(heightInInches * 0.0254, 2);
		System.out.printf("BMI is %.4f\n", bmi);
	}
}
