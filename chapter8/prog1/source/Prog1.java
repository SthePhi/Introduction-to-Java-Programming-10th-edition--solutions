import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		//scan for array elements and column to be summed
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double[][] arr = new double[3][4];
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = input.nextDouble();
			}
		}
		System.out.print("Enter the row to be summed: ");
		int column = input.nextInt();
		System.out.println("Sum of elements at column " + column + " is " + sumColumn(arr, column));
	}

	//sum up element in certain column
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0;
		for (int i = 0; i < m.length; i++)
		{
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
