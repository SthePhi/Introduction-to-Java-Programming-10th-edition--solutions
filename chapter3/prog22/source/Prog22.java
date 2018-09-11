import java.util.Scanner;

public class Prog22
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point witn two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));

		if (distance <= 10)
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
	}
}
