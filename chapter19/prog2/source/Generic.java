import java.util.ArrayList;

public class Generic extends ArrayList<E>
{
	public int void getSize()
	{
		return size();
	}

	public Object peek()
	{
		return get(getSize() - 1);
	}

	public Object pop()
	{
		Object x = getSize() - 1;
		remove(getSize - 1);
		return x;
	}

	public void push(Object x)
	{
		add(x);
		return x;
	}

	public boolean isEmpty()
	{
		return isEmpty();
	}
}
