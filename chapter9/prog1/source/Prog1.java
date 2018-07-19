public class Prog1
{
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle1 has a height of " + rect1.height + ", a width of " + rect1.width + ", an area of " + rect1.getArea() + " and a perimeter of " + rect1.getPerimeter());
		System.out.println("Rectangle1 has a height of " + rect2.height + ", a width of " + rect2.width + ", an area of " + rect2.getArea() + " and a perimeter of " + rect2.getPerimeter());
	}
}
