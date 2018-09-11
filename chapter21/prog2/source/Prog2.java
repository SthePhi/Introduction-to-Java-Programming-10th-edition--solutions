import java.util.Scanner;
import java.util.HashSet;
import java.io.File;

public class Prog2
{
	public static void main(String[] args)
	{
		try
		{
			Scanner input = new Scanner(new File(args[0]));
			String myString = input.nextLine();
			String[] arr = myString.split(", ");
			HashSet<String> set = new HashSet<>();

			for (String x: arr)
			{
				set.add(x);
			}
			set.sort();
		
			System.out.println(set);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
