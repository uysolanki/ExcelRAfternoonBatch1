package day16.inheritanceday2;

public class Aradhya extends Abhishek{
	String qualification="UG";

	public void office()
	{
		System.out.println("Andheri");
	}
	
	public void house()
	{
		System.out.println("Bandra");
	}
	
	public double area(int radius)
	{
		return 3.14*radius*radius;
	}
	
	public double area(int length, int breadth)
	{
		return length*breadth;
	}
}
