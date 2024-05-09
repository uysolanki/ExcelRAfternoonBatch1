package day10;

import java.util.Scanner;

public class Student {

	
	int rno;
	String sname;
	double per;
	
	public Student()
	{
		rno=18;
		sname="Virat";
		per=50.0;
	}
	
	
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	public Student(Student temp) //Copy Constructor
	{
		this.rno = temp.rno;
		this.sname = temp.sname;
		temp.per=58.8;
		this.per = temp.per;
	}

	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rno"); //101
		rno=sc.nextInt();
		
		System.out.println("Enter Name");//Alice
		sname=sc.next();
		
		System.out.println("Enter Percentage");//78.5
		per=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

	
	
	
}
