import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		//scan for unspecified number of integer values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer, input ends with 0: ");
		int nmb = input.nextInt();

		int x = 0;
		int pos = 0;
		int neg = 0;
		int count = 0;
		double sum = 0;
		while (nmb != 0)
		{
			if (nmb > 0)
				pos++;
			else if (nmb < 0)
				neg++;
			sum += nmb;
			nmb = input.nextInt();
			x++;
		}

		double avg = sum / x;
		System.out.println("The number of positives is " + pos);
		System.out.println("The number if negatives is " + neg);
		System.out.println("THe total is " + (int)(sum));
		System.out.println("The average is " + avg);

	}
}
