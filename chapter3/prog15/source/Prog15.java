import java.util.Scanner;

public class Prog15
{
	public static void main(String[] args)
	{
		int lottery = (int)(Math.random() * 1000);
		final int LOTTERY = lottery;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		final int GUESS = guess;

		//Get digits from lottery
		int lotteryDigit3 = lottery % 10;
		lottery /= 10;
		int lotteryDigit2 = lottery % 10;
		lottery /= 10;
		int lotteryDigit1 = lottery;

		//Get digits form guess
		int guessDigit3 = guess % 10;
		guess /= 10;
		int guessDigit2 = guess % 10;
		guess /= 10;
		int guessDigit1 = guess;

		System.out.println("The lottery number is " + LOTTERY);

		//Check the guess
		if (GUESS == LOTTERY)
			System.out.println("Match lottery number in exact order: you award is $10 000");
		else if ((lotteryDigit1 == guessDigit1
		      || lotteryDigit1 == guessDigit2
		      || lotteryDigit1 == guessDigit3)
		      && (lotteryDigit2 == guessDigit1
		      || lotteryDigit2 == guessDigit2
		      || lotteryDigit2 == guessDigit3)
		      && (lotteryDigit3 == guessDigit1
		      || lotteryDigit3 == guessDigit2
		      || lotteryDigit3 == guessDigit3))
			System.out.println("Match all digits in the lottery number: you award is $3 000");
		else if (lotteryDigit1 == guessDigit1
                      || lotteryDigit1 == guessDigit2
                      || lotteryDigit1 == guessDigit3
                      || lotteryDigit2 == guessDigit1
                      || lotteryDigit2 == guessDigit2
                      || lotteryDigit2 == guessDigit3
                      || lotteryDigit3 == guessDigit1
                      || lotteryDigit3 == guessDigit2
                      || lotteryDigit3 == guessDigit3)
                        System.out.println("Matches a digit in the lottery number: your award is $1 000");
		else
			System.out.println("Sorry, no match");
	}
}
