package day17.abstraction;

public class Circle implements Shape
{
	public void area()
	{
		double ans=3.14*5*5;
		System.out.println("Area of Circle is " +ans);
	}
	public void perimeter()
	{
		double ans=2*3.14*5;
		System.out.println("Perimeter of Circle is " +ans);
	}
}
