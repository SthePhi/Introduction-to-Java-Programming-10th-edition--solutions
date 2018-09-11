import java.util.Scanner;

public class Prog12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three digits integer: ");
		int nmb = input.nextInt();
		int pal = nmb;

		int a = nmb % 10;
		nmb /= 10;
		int b = nmb % 10;
		nmb /= 10;
		int c = nmb;

		if (a == c)
			System.out.println(pal + " is a palindrome");
		else
			System.out.println(pal + " is not a palindrome");
	}
}
