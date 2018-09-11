import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter two integers to get their sum: ");
			int a = input.nextInt();
			int b = input.nextInt();
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);
		}
		catch(Exception e)
		{
			System.out.println("Wrong iput! Please read the number again");
		}
	}
}
