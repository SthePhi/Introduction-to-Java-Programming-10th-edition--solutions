import java.util.Scanner;

public class Prog25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (x1 * (y1 - y2)) - (y1 * (x1 - x2));
		double f = (x3 * (y3 - y4)) - (y3 * (x3 - x4));

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if (a * d - b * c == 0)
			System.out.println("The two lines are parallel");
		else
			System.out.printf("The intersecting point is at (%.5f, %.5f).\n", x, y);


	}
}
