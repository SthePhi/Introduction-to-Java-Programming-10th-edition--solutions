import java.util.Scanner;

public class Prog27
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x and y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		System.out.println(perimeter);

		if (x >= 0 && y >= 0 && y <= -5.0 * x + 100)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}
