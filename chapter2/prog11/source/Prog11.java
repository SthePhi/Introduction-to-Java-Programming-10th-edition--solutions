import java.util.Scanner;

public class Prog11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();

		int birth = ((3600 * 24 * 365) * numberOfYears) / 7;
		int death = ((3600 * 24 * 365) * numberOfYears) / 13;
		int immigrants = ((3600 * 24 * 365) * numberOfYears) / 45;
		int population = 312032486;
		System.out.println("The population in " + numberOfYears + " years is " + (population + birth + immigrants - death));
	}
}
