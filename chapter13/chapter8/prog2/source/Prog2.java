import java.util.Scanner;

public class Prog2
{
	public static void main(String[] args)
	{
		//scan for elements of a matrix
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] arr = new double[4][4];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < 4; j++)
				arr[i][j] = input.nextDouble();
		}
		System.out.println("Sum of elements in major diagonal is " + sumMajorDiagonal(arr));
	}

	//sum elemts in a major diagonal in a matrix
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum = 0;
		for (int i = 0; i < m.length; i++)
		{
			sum += m[i][i];
		}
		return sum;
	}
}
