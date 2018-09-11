import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		//scan for number of students and their grades
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of student: ");
		int size = input.nextInt();
		System.out.print("Enter " + size + " scores: ");

		//create an array of grades
		int[] arr = new int[size];
		int best = input.nextInt();
		arr[0] = best;
		for (int i = 1; i < arr.length; i++)
			arr[i] = input.nextInt();

		//find the best grade
		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] > best)
				best = arr[j];
		}

		//print out results
		for (int j = 0; j < size; j++)
		{
			if (arr[j] >= (best - 10))
				System.out.println("Student " + j + "'s score is " + arr[j] + " and Grade is A");
			else if (arr[j] >= best - 20)
				System.out.println("Student " + j + "'s score is " + arr[j] + " and Grade is B");
			else if (arr[j] >= best - 30)
				System.out.println("Student " + j + "'s score is " + arr[j] + " and Grade is C");
			else if (arr[j] >= best - 40)
				System.out.println("Student " + j + "'s score is " + arr[j] + " and Grade is D");
			else
				System.out.println("Student " + j + "'s score is " + arr[j] + " and Grade is F");
		}

	}
}
