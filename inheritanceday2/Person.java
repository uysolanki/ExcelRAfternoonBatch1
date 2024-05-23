package day16.inheritanceday2;

import java.util.Scanner;

public class Person {

	long adharNo;
	String name;
	int age;
	
	public Person() //No Args Constructor
	{
		adharNo=111122223333L;
		name="Rahul";
		age=21;
	}  
	public Person(long adharNo, String name, int age)  //Parameterised Constructor
	{
		//??
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
	}
		
	void acceptPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Adhar No");
		adharNo=sc.nextLong();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
		
	}
	
	void displayPerson()
	{
		System.out.println("Adhar No is "+ this.adharNo);
		System.out.println("Name is " + this.name);
		System.out.println("Age is "+ this.age);
	}
	
}
