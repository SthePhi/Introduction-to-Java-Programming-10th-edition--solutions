public class Prog7
{
	public static void main(String[] args)
	{
		double percent = 5 / 100;
		double tuition = 10000;
		
		for (int i = 0; i < 10; i++)
		{
			tuition = tuition + (tuition * percent);
		}
		System.out.println("tut = " + tuition);
	}
}
