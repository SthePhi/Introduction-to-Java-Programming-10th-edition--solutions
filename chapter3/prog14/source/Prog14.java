import java.util.Scanner;

public class Prog14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 for heads and 1 for tails: ");
		int guess = input.nextInt();

		int generated = (int)(Math.random() * 2);
		if (generated == guess)
			System.out.println("Your guess is correct!");
		else
			System.out.println("YOu guessed it wrong!");
	}
}
