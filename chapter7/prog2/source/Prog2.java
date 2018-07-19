import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		System.out.print("Enter ten integers: ");
		int[] arr = createArray();
		displayReverse(arr);
	}

	public static int[] createArray()
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++)
		{
			arr[i] = input.nextInt();
		}
		return arr;
	}

	public static void displayReverse(int[] ar)
	{
		for (int i = 15; i >= 0; i--)
			System.out.print(ar[i]);
		System.out.println();
	}
}
