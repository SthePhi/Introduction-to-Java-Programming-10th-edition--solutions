import java.util.Scanner;

public class Prog9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		final int ISBN = input.nextInt();
		int nmb  = ISBN;

		int d9 = (nmb % 10);
		nmb /= 10;

		int d8 = (nmb % 10);
		nmb /= 10;

		int d7 = (nmb % 10);
		nmb /= 10;

		int d6 = (nmb % 10);
		nmb /= 10;

		int d5 = (nmb % 10);
		nmb /= 10;

		int d4 = (nmb % 10);
		nmb /= 10;

		int d3 = (nmb % 10);
		nmb /= 10;

		int d2 = (nmb % 10);
		nmb /= 10;

		int d1 = (nmb % 10);
		nmb /= 10;

		int checksum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
		if (checksum == 10)
			System.out.println("The ISBN-10 number is " + ISBN + "X");
		else
			System.out.printf("The ISBN-10 number is %d%d\n", ISBN, checksum);
	}
}
