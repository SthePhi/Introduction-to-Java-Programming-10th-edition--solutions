public class Prog6
{
	public static void main(String[] args)
	{
		System.out.println("Miles	Kilometers	|  Kilometers	Miles");
		for (int i = 1, j = 20; i < 11; i++, j += 5 )
		{
			System.out.printf("%d		%.3f	|  %d	%.3f\n", i, i * 1.609, j, j / 1.609);
		}
	}
}
