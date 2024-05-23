package day16.inheritanceday2;

import java.util.Scanner;

public class Employee extends Person {

	int eno;
	String desg;
	double sal;
	
	public Employee()
	{
		this.eno=101;
		this.desg="Manager";
		this.sal=800;
		super.displayPerson();
	}
	
	public Employee(long adharNo, String name, int age,int d, String e, double f)
	{
		super(adharNo,name,age);
		this.eno=d;
		this.desg=e;
		this.sal=f;
	}
	
	void acceptEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No");
		this.eno=sc.nextInt();
		System.out.println("Enter Desg");
		this.desg=sc.next();
		System.out.println("Enter Sal");
		sal=sc.nextDouble();
		
	}
	
	void displayEmployee()
	{
		System.out.println("Emp No is "+ this.eno);
		System.out.println("Designation is " + this.desg);
		System.out.println("Sal is "+ this.sal);
		super.displayPerson();
	}
	

}
