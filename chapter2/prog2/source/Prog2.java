import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		//scan for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and the length of the cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;
		double volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
