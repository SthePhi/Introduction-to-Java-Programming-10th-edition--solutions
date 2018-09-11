import java.io.*;

public class Prog1
{
	public static void main(String[] args)
	{
		try
		{
			PrintWriter file = new PrintWriter(new File("Exercise17_01.txt"));
			for (int i = 0; i < 100; i++)
			{
				file.print((int)(Math.random() * 100));
				file.print(' ');
			}
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
