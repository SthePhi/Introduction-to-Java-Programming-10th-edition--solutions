import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		//scan for a number of type long
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		long nbr = input.nextInt();
		System.out.println("The sum of it's digits is " + sumDigits(nbr));
	}

	//calculate the sum of digits in n, the parameter
	public static int sumDigits(long n)
	{
		int sum = 0;
		int nmb = 0;
		while (n != 0)
		{
			nmb = (int)(n % 10);
			sum += nmb;
			n = n - nmb;
			n = n / 10;
		}
		return sum;
	}
}
