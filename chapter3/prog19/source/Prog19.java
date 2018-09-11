import java.util.Scanner;

public class Prog19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coordinates for three edges of a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double edge1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double edge2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double edge3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		if (edge1 + edge2 > edge3 && edge3 + edge2 > edge1 && edge1 + edge3 > edge2)
			System.out.printf("The perimeter of this triangle is %.2f\n", (edge1 + edge2 + edge3));
		else
			System.out.println("The input is invalid");
	}
}
