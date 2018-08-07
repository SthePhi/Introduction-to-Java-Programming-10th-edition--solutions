import java.util.Scanner;

public class Prog15
{
	public static void main(String[] args)
	{
		//scan for coordinates i.e x1, y1, x2 and y2
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		//now calculate the distance between these two points
		double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		System.out.printf("The distamce between the two points is %.4f\n", distance);
	}
}
