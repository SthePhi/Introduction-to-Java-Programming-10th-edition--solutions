public class Prog4
{
	public static void main(String[] args)
	{
		System.out.println("Miles	Kilometers");
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%d	%.3f\n", i, i * 1.609);
		}
	}
}
