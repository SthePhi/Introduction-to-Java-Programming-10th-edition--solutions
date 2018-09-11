public class Rectangle
{
	double width;
	double height;

	public Rectangle()
	{
		width = 1;
		height = 1;
	}

	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public double getArea()
	{
		return height * width;
	}

	public double getPerimeter()
	{
		return width + height + width + height;
	}
}
