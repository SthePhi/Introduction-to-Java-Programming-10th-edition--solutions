import java.util.Scanner;

public class Prog8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int thirdNumber = input.nextInt();

		if ((firstNumber < secondNumber && firstNumber < thirdNumber) && secondNumber < thirdNumber)
		{
			System.out.print(firstNumber);
			System.out.print(secondNumber);
			System.out.println(thirdNumber);
		}
		else if ((firstNumber < secondNumber && firstNumber < thirdNumber) && secondNumber > thirdNumber)
		{
			System.out.print(firstNumber);
			System.out.print(thirdNumber);
                        System.out.println(secondNumber);
		}
		else if ((firstNumber > secondNumber && thirdNumber > secondNumber) && firstNumber < thirdNumber)
		{
			System.out.print(secondNumber);
			System.out.print(firstNumber);
                        System.out.println(thirdNumber);
		}
		else if ((firstNumber > secondNumber && thirdNumber > secondNumber) && firstNumber > thirdNumber)
		{
			System.out.print(secondNumber);
			System.out.print(thirdNumber);
                        System.out.println(firstNumber);
		}
		else if ((firstNumber > thirdNumber && secondNumber > thirdNumber) && firstNumber < secondNumber)
		{
			System.out.print(thirdNumber);
			System.out.print(firstNumber);
                        System.out.println(secondNumber);
		}
		else if ((firstNumber > thirdNumber && secondNumber > thirdNumber) && firstNumber > secondNumber)
		{
			System.out.print(thirdNumber);
			System.out.print(secondNumber);
                        System.out.println(firstNumber);
		}
	}
}
