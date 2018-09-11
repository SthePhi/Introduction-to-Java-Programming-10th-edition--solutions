import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		//generate three randon integers
		int a = (int)(System.currentTimeMillis() % 10);
		int b = (int)(System.currentTimeMillis() / 7.0 % 10);
		int c = (int)(System.currentTimeMillis() % 100);
		int sum = a + b + c;

		//scan for input for sum
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tthe sum of " + a + " + " + b + " + " + c + ": ");
		int answer = input.nextInt();

		if (answer == sum)
			System.out.println("Correct! " + a + " + " + b + " + " + c +" is " + sum );
		else
			System.out.println("Wrong answer. Please try again");


	}
}
