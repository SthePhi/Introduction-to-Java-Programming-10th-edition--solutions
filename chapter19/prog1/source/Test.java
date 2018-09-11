public class Test
{
	public static void main(String[] args)
	{
		Prog1<Integer> one = new Prog1<>(6);
		one.push(1);
		one.push(2);
		one.push(3);
		one.push(4);
		System.out.println(one.peek());
		System.out.println(one.pop());
	}
}
