import java.util.Scanner;

public class Prog7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long min = input.nextLong();
		int years = (int)(min / 525600);
		int days = (int)((min % 525600) / 1440);
		System.out.println(min + " minutes is approximately " + years + " and " + days + " days");
	}
}
