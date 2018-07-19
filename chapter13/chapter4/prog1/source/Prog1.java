import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		//scan for length from center to vertex
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length from centr to vertex: ");
		double r = input.nextDouble();

		double s = 2 * r * Math.sin(Math.PI / 5.0);
		double area = (5 * (s * s)) / (4 * Math.tan(Math.PI / 5.0));
		System.out.println("The area of the pentagon is " + area);
	}
}
