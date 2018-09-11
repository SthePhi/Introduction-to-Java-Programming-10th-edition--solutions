import java.util.LinkedHashSet;
import java.util.Arrays;

public class Prog1
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> set1 = new LinkedHashSet<String>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Micheal"));
        	LinkedHashSet<String> set2 = new LinkedHashSet<String>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

		LinkedHashSet<String> union = (LinkedHashSet<String>)set1.clone();
		union.addAll(set2);

		LinkedHashSet<String> diff = (LinkedHashSet<String>)set1.clone();
		diff.removeAll(set2);

		LinkedHashSet<String> intersect = (LinkedHashSet<String>)set1.clone();
		intersect.retainAll(set2);

		System.out.println("Union: " + union);
		System.out.println("Difference: " + diff);
		System.out.println("Intersection: " + intersect);
	}
}
