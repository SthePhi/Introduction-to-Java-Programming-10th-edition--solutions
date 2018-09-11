import java.util.Comparator;
import java.util.Arrays;

public class Prog1
{
	public static void main(String[] args)
	{
		Integer[] arr = {4, 3, 7, 4, 8, 2 , 5};
		Character[] arr2 = {'f', 'd', 'j', 'v', 'o', 'd', 'q', 'v', 'z'};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
//		bubbleSort(arr, rator);
//		System.out.println(Arrays.toString());
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] list)
	{
		for (int j = 0; j < list.length; j++)
		{
			for (int i = 0; i < list.length - 1; i++)
			{
				if ((list[i].compareTo(list[i + 1])) > 0)
				{
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}

	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
	{
		for (int j = 0; j < list.length; j++)
		{
			for (int i = 0; i < list.length; i++)
			{
				if ((comparator.compare(list[i], list[i + 1])) > 0)
				{
					E temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}
}
