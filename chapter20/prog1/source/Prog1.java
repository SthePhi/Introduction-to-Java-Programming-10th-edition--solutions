import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;

public class Prog1
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		try
		{
			File make = new File("asc.txt");
			Scanner input = new Scanner(make);
			while(input.hasNext())
			{
				list.add(input.nextLine());
			}
			sort(list);
			System.out.println(list);
		}
		catch(Exception e)
		{
			System.out.println("what");
		}
	}

	public static void sort(List list)
	{
		int x = 0;
		for (int i = 0; i < list.size(); i++)
		{
			for (int j = i; j < list.size(); j++)
			{
				if (list.get(i).compareTo(list.get(j)) < 1)
				{
					Object temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
			
		}
	}
}
