import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your index: ");
		int index = input.nextInt();
		System.out.println(fib(index));
	}

	public static int fib(int index)
	{
		int a = 0;
		int b = 1;
		int c = a + b;
		for (int i = 3; i < index; i++)
		{
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}
}
