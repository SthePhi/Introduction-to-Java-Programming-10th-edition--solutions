import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Indicate whether the shape is filled: ");
		boolean filled = input.nextBoolean();
		System.out.print("Now enter the color: ");
		String color = input.next();

		Triangle tri = new Triangle(side1, side2, side3);
		tri.setColor(color);
		tri.setFilled(filled);

		System.out.println("The area = " + tri.getArea() + " and perimeter = " + tri.getPerimeter());
		System.out.println("The color is " + color + " and is " + filled);
	}
}
