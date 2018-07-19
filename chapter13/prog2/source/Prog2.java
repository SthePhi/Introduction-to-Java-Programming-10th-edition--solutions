import java.util.ArrayList;

public class Prog2
{
	public static void main(String[] args)
	{
		ArrayList<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		shuffle(list);
	}

	public static void shuffle(ArrayList<Number> list)
	{
		int index = 0;
		Number temp = 0;
		for (int i = 0; i < list.size() - 1; i++)
		{
			index = (int)(Math.random() * list.size());
			temp = list.get(i);
			list.set(i, list.get(index));
			list.set(index, temp);
		}
		System.out.println(list);
	}
}
