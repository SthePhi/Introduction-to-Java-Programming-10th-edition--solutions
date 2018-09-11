public abstract class GeometricObject
{
	private boolean filled;
	private String color;

	public GeometricObject()
	{
		filled = false;
		color = "white";
	}

	public GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}

	public String getColor()
	{
		return color;
	}

	public boolean isFilled()
	{
		return filled;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	public abstract  double getArea();
}
