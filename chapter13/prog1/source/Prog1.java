import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		//scan for coordinates
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your coordinates: ");
		double side1x = input.nextDouble();
		double side1y = input.nextDouble();
		double side2x = input.nextDouble();
		double side2y = input.nextDouble();
		double side3x = input.nextDouble();
		double side3y = input.nextDouble();

		//calculate distances for the three side
		double s1 = Math.sqrt(Math.pow((side2x - side1x), 2) + (Math.pow((side2y - side1y), 2)));
		double s2 = Math.sqrt(Math.pow((side3x - side2x), 2) + (Math.pow((side3y - side2y), 2)));
		double s3 = Math.sqrt(Math.pow((side1x - side3x), 2) + (Math.pow((side1y - side3y), 2)));

		//scan for color and check if it filled with color
		System.out.print("Enter your color: ");
		String colour = input.next();
		System.out.print("Is it filled with color?: ");
		boolean fill = input.nextBoolean();

		Triangle angle = new Triangle(s1, s2, s3);
		angle.setColor(colour);
		angle.setFilled(fill);
		System.out.println("Area = " + angle.getArea() + " and " + "Perimeter = " + angle.getPerimeter());
		System.out.println("Color is " + angle.getColor());
		System.out.println("Is it filled with color: " + angle.isFilled());
	}
}
