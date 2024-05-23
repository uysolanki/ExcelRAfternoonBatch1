package day17.abstraction;

public class ClonableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(101,"Alice",78.5);
		Student s2=s1;
//		System.out.println(s2.getSname());
//		System.out.println(s1==s2);
		
		Student s3=new Student();
		s3.setPer(s1.getPer());
		s3.setRno(s1.getRno());
		s3.setSname(s1.getSname());
		
//		System.out.println(s3.getSname());
//		System.out.println(s1==s3);
		
		Student s4=(Student)s1.clone();
		System.out.println(s1==s4);
		System.out.println(s4);

	}

}
