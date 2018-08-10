import java.util.Scanner;

public class Prog5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days since today: ");
		int numberOfDays = input.nextInt();

		int futureDay = (numberOfDays % 7) + today;
		String day = "";
		String fDay = "";
		switch (futureDay)
		{
			case 0:
				fDay = "Sunday";
				break;
			case 1:
				fDay = "Monday";
				break;
			case 2:
				fDay = "Tuesday";
				break;
			case 3:
				fDay  = "Wednesday";
				break;
			case 4:
				fDay = "Thursday";
				break;
			case 5:
				fDay = "Friday";
				break;
			case 6:
				fDay = "Saturday";
		}
		 switch (today)
                {
                        case 0:
                                day = "Sunday";
                                break;
                        case 1:
                                day = "Monday";
                                break;
                        case 2:
                                day = "Tuesday";
                                break;
                        case 3:
                                day  = "Wednesday";
                                break;
                        case 4:
                                day = "Thursday";
                                break;
                        case 5:
                                day = "Friday";
                                break;
                        case 6:
                                day = "Saturday";
                }

		System.out.println("Today is " + day + " and the future day is " + fDay);
	}
}
