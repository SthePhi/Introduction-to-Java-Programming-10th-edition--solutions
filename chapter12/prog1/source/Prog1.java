import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your simple equation: ");
			double operand1 = input.nextDouble();
			String operator = input.next();
			double operand2 = input.nextDouble();
			System.out.println(result(operand1, operator, operand2));
		}
		catch(Exception e)
		{
			System.out.println("Operand(s) non-numeric");
		}
	}

	public static double result(double o1, String op, double o2) throws NumberFormatException
	{
		double rslt = 0;
		if (op.equals("+"))
			rslt = o1 + o2;
		else if (op.equals("-"))
			rslt = o1 - o2;
		else if (op.equals("*"))
			rslt = o1 * o2;
		else if (op.equals("/"))
			rslt = o1 / o2;
		return rslt;
	}
}
