import java.util.Scanner;

public class Prog3
{
	public static void main(String[] args)
	{
		//prompt the user to insert values for 
		//variables a, b, c, d, e, f to solve a linear equation
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		//calculate ad - bc and use it as a denominator when you compute x and y
		double denominator = (a * d) - (b * c);
		double x = (e * d - b * f) / denominator;
		double y = (a * f - e * c) / denominator;

		//if ad - bc is equal to 0 then the equation has no solution, so use
		//if - else to display the results
		if (denominator == 0)
			System.out.println("The equation has no solution.");
		else
			System.out.println("x is " + x + " and y is " + y);
	}
}
