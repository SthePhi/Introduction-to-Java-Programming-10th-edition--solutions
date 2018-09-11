public class Prog16
{
	public static void main(String[] args)
	{
		//Generate random x and y coordinates
		double x = -50 + Math.random() * 100;
		double y = -100 + Math.random() * 200;
		System.out.printf("The random point in this rectangle is (%.2f, %.2f).\n", x, y);
	}
}
