import java.util.Scanner;

public class Prog22
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		int remainingAmount = input.nextInt();
		double amount = remainingAmount / 100d;

		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
	       	remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println("	" + numberOfDollars + " dollars");
		System.out.println("	" + numberOfQuarters + " quarters");
		System.out.println("	" + numberOfDimes + " dimes");
		System.out.println("	" + numberOfNickels + " nickels");
		System.out.println("	" + numberOfPennies + " pennies");
	}
}
