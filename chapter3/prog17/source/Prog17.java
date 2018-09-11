import java.util.Scanner;

public class Prog17
{
	public static void main(String[] args)
	{
		//Randomly generate integer number from 0 to 3
		int computer = (int)(Math.random() * 3);

		Scanner input = new Scanner(System.in);
		System.out.print("Scissors(0), Rock(1), Paper(2): ");
		int guess = input.nextInt();

		//Check the guess
		if (computer == 0)
		{
			if (guess == 0)
				System.out.println("The computer is scissors. You are too. It is a draw");
			else if (guess == 1)
				System.out.println("The computer is scissors. You are rock. You win");
			else
				System.out.println("The computer is scissors. You are paper. You lose");
		}
		else if (computer == 1)
		{
			if (guess == 0)
				System.out.println("The computer is rock. You are scissors. You lose");
			else if (guess == 1)
				System.out.println("The computer is rock. You are too. It's a draw");
			else
				System.out.println("The computer is rock. You are paper.You win");
		}
		else
		{
			if (guess == 0)
				System.out.println("The computer is paper. You are scissors. You win");
			else if(guess == 1)
				System.out.println("The computer is paper. You are rock. You lose");
			else
				System.out.println("The computer is paper. You are too. It's a draw");
		}
		
	}
}
