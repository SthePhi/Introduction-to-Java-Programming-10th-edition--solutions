import java.util.Scanner;

public class Prog2
{
	private String name;
	private int age;
	private double weight;
	private double feet;
	private double inches;

	public BMI(String name, int age, double weight, double feet, double inches)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	public getBMI()
	{
		double weightInKilos = weight * 0.45359237
		double height = (feet * 12 + inches) * 0.0254;
		double bmi = weightInKilos / (height * height);
		return bmi;
	}
}
