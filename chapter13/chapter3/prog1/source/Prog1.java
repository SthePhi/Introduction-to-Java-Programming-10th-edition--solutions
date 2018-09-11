import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double disc = Math.sqrt((b* b) - 4 * a * c);
		double root1 = ((-b) - disc) / (2 * a);
		double root2 = ((-b) + disc) / (2 * a);

		if (disc > 0)
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		else if (disc == 0)
			System.out.println("The equation has one root " + root1);
		else
			System.out.println("The equation has no real roots");
	}
}
