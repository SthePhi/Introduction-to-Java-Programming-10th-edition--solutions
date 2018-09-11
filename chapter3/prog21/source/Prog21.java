import java.util.Scanner;

public class Prog21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter month (1 - 12):");
		int m = input.nextInt();
		if (m < 3)
		{
			m += 12;
			year -= 1;
		}

		System.out.print("Enter the day of the month(1 - 31): ");
		int q = input.nextInt();

		int h = (q + ((26 * (m + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;
		switch (h)
		{
			case 0:
				System.out.println("The day of the week is Saturday");
				break;
			case 1:
				System.out.println("The day of the week is Sunday");
				break;
			case 2:
				System.out.println("The day of the week is Monday");
				break;
			case 3:
				System.out.println("The day of the week is Tuesday");
				break;
			case 4:
				System.out.println("The day of the week is Wednesday");
				break;
			case 5:
				System.out.println("The day of the week is Thursday");
				break;
			case 6:
				System.out.println("The day of the week is Friday");
		}
	}
}
