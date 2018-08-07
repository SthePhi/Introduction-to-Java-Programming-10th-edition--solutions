import java.util.Scanner;

public class Prog13
{
	public static void main(String[] args)
	{
		//scan for monthly saving amount.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();

		//calculate the amaount value for six months
		double principal = amount * (1 + 0.00417);
		principal = (amount + principal) * (1 + 0.00417);
		principal = (amount + principal) * (1 + 0.00417);
		principal = (amount + principal) * (1 + 0.00417);
		principal = (amount + principal) * (1 + 0.00417);
		principal = (amount + principal) * (1 + 0.00417);

		System.out.printf("After six months, the account value is %.2f\n", principal);
	}
}
