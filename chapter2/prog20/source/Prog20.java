import java.util.Scanner;

public class Prog20
{
	public static void main(String[] args)
	{
		//prompt the user to enter balance and annual interest rate
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate: ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();

		//calculate interest earned
		double interest = balance * (interestRate / 1200.0);
		System.out.printf("The interest is %.5f\n", interest);
	}
}
