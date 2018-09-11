import java.io.*;

public class Prog2
{
	public static void main(String[] args)
	{
		try
		{
			DataOutputStream file = new DataOutputStream(new FileOutputStream("Excercise17_02.dat", true));
			for (int i = 0; i < 100; i++)
			{
				file.writeInt((int)(Math.random() * 100));
			}
			file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
