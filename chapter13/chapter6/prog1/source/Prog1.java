public class Prog1
{	public static void main(String[] args)
	{
		for (int i = 1, j = 0; i < 100 && j <= 10; i++, j++)
		{
			System.out.printf("%5d ", getPentagonalNumber(i));
			if (j == 10)
			{
				System.out.println();
				j = 0;
			}
		}
		System.out.println();
	}

	public static int getPentagonalNumber(int nmb)
	{
		return nmb * ((3 * nmb) - 1) / 2;
	}
}
