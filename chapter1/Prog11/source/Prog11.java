public class Prog11
{
	public static void main(String[] args)
	{
		int birth = ((3600 * 24 * 365) * 5) / 7;
		int death = ((3600 * 24 * 365) * 5) / 13;
		int immigrants = ((3600 * 24 * 365) * 5) / 45;
		int population = 312032486;
		System.out.println(population + birth + immigrants - death);
	}
}
