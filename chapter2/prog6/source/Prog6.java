import java.util.Scanner;

public class Prog6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int nmb = input.nextInt();
		int sum = nmb % 10;
		nmb = nmb / 10;
		sum +=(nmb % 10);
		nmb = nmb / 10;
		sum += (nmb % 10);
		System.out.println("The sum of the digits is " + sum);			
	}
}
