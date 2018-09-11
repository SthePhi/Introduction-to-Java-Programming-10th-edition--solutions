import java.util.Arrays;

public class Prog1<E>
{
	private String type;
	private Object[] arr;

	public Prog1(int size)
	{
		arr = new Object[size];
	}

	public int getSize()
	{
		return arr.length;
	}

	public Object peek()
	{
		return arr[arr.length - 1];
	}

	public Object pop()
	{
		Object o = arr[arr.length - 1];
		arr[arr.length - 1] = 0;
		return o;
	}

	public void push(Object o)
	{
		if (isFull() == true)
		{
			Object[] arr2 = new Object[arr.length * 2];
			arr2[arr.length] = o;
		}
		else
			arr[arr.length - 1] = o;		
	}

	public boolean isFull()
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != null)
				count++;
		}

		if(count == arr.length)
			return true;
		return false;
	}

	public boolean isEmpty()
	{
		if (arr.length == 0)
			return true;
		return false;
	}
}
