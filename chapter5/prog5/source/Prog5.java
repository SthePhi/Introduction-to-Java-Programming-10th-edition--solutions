public class Prog5
{
	public static void main(String[] args)
	{
		System.out.println("Kilograms Pounds	|	Pounds	Kilograms");

		for (int i = 1, j = 20; i < 200; i += 2, j += 5)
		{
			System.out.printf("%d	%.1f	|	%d	%.2f\n", i, i * 2.2, j, j / 2.2);
		}
	}
}
