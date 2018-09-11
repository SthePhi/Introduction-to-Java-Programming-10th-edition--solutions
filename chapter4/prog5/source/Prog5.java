import java.util.Scanner;

public class Prog5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n = input.nextInt();
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		double area = (n * Math.pow(s, 2)) / (4.0 * Math.tan(Math.PI / n));
		System.out.printf("The area of the polygin is %.2f\n", area);
	}
}
