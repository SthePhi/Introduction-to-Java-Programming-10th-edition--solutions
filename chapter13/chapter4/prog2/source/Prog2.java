import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		//scan for two points in terms of longotude and latitude
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point 1 (longitude and latitude) in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		System.out.print("Enter point 2 (longitude and latitude) in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());

		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1));
		System.out.println("The distance between two points is " + d + "km");
	}
}
