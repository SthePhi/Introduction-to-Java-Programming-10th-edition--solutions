import java.util.Scanner;

public class Prog5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		System.out.println("The gratuity is $" + subtotal * (gratuity / 100) + " and total is $" + (subtotal + (subtotal * ( gratuity / 100))));
	}
} 
