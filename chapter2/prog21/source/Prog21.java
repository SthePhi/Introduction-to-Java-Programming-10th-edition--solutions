import java.util.Scanner;

public class Prog21
{
	public static void main(String[] args)
	{
		//prompt the user to insert investment amout,
		//interest rate in percentage and number of years
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double iAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double aInterest = input.nextDouble();
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();

		//calculate the future value
		double fv = iAmount * Math.pow(1 + aInterest / 1200.0, numberOfYears * 12);
		System.out.printf("Accumulated value is %.2f\n", fv);
	}
}
