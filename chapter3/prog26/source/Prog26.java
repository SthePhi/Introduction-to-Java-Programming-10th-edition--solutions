import java.util.Scanner;

public class Prog26
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int nmb = input.nextInt();

		if (nmb % 5 == 0 && nmb % 6 ==0)
			System.out.println("Is " + nmb + " divisible by 5 and 6? true");
		else
			System.out.println("Is " + nmb + " divisible by 5 and 6? false");

		if (nmb % 5 == 0 || nmb % 6 == 0)
			System.out.println("Is " + nmb + " divisible by 5 or 6? true");
		else
			System.out.println("Is " + nmb + " divisible by 5 or 6? false");

		if (nmb % 5 == 0 ^ nmb % 6 == 0)
			System.out.println("Is " + nmb + " divisible by 5 or 6, but not both? true");
		else 
			System.out.println("Is " + nmb + " divisible by 5 or 6, but not both? false");
	}
}
