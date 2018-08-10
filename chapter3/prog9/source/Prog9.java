import java.util.Scanner;

public class Prog9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
		int isbn = input.nextInt();

		int sum = 0;
		sum = sum + (isbn % 10);
		isbn = isbn / 10;
		System.out.println(isbn + " <---> " + sum);
	}
}
