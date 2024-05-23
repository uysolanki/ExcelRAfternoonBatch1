package day16.inheritanceday2;

public class DrMoDriver {

	public static void main(String[] args) {
//		Father s1=new Son();
//		System.out.println(s1.qualification); //Data of Ref
//		s1.car(); //Method of Son
		
//		Dog d1=new Dog();
//		d1.run();
//		System.out.println(d1.name);
		
		Aradhya a1=new Aradhya();
		a1.house();
		System.out.println(a1.qualification);
		
		System.out.println("Area of Circle" +a1.area(5));
		
		System.out.println("Area of Rect" +a1.area(5,10));
		
	}

}
