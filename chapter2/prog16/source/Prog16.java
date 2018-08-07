import java.util.Scanner;

public class Prog16
{
	public static void main(String[] args)
	{
		//scan for the side of a hexagon
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		//calculate the area of the hexagon
		double area = ((3 * Math.sqrt(3)) / 2.0) * Math.pow(s, 2);
		System.out.printf("The area of the hexagon is %.8f\n", area);
	}
}
