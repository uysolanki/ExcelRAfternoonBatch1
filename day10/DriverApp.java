package day10;

public class DriverApp {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		Student s2=new Student(45,"Rohit",88.5);
		System.out.println(s2);
		Student s3=new Student(s2);
		System.out.println(s1);
		
		System.out.println(s3);
		
	}

	
}
