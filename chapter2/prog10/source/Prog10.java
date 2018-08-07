import java.util.Scanner;

public class Prog10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in Kilograms: ");
		double water = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double temperature0 = input.nextDouble();
		System.out.print("Enter final temperature: ");
		double temperature1 = input.nextDouble();

		double energy = water * (temperature1 - temperature0) * 4184;
		System.out.println("The energy needed is " + energy);
	}
}
