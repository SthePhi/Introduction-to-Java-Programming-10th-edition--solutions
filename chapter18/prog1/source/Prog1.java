import java.util.Scanner;
import java.math.BigInteger;

public class Prog1
{
	public static void main(String[] args)
	{

		System.out.println(fact(new BigInteger("100u")));
	}

	//find a factorial for a java.math.BigInteger type
	public static BigInteger fact(BigInteger n)
	{
		if (n.equals(new BigInteger("1")) )
			return new BigInteger("1");
		else if (n.equals(new BigInteger("0")))
			return new BigInteger("1");
		return n.multiply(fact(n.subtract(new BigInteger("1"))));
	}
}
