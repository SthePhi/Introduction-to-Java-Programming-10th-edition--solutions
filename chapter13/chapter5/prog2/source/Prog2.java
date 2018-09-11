import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_QUESTIONS = 10;
		int corrCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";

		Scanner input = new Scanner(System.in);
		while (count < NUMBER_OF_QUESTIONS)
		{
			int number1 = (int)(Math.random() * 15);
			int number2 = (int)(Math.random() * 15);

			if (number1 < number2)
			{
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is " + number1 + " + " + number2 + " ?");
			int answer = input.nextInt();

			if (number1 + number2 == answer)
			{
				System.out.println("You are correct!");
				corrCount++;
			}
			else
				System.out.println("Your answer is wrong.\n");
			count++;
			output += "\n" + number1 + " + " + number2 + " = " + answer  + ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + corrCount + " \nTest time is " + testTime /1000 + " seconds\n" + output);
	}
}
