package day34garbagecollection;

public class GarbageCollectionDemo {

//	public static void main(String[] args) {
//		//Reassign the reference
//		String s1="Alice";//Eligible for GC
//		s1="Ben";
//		
//		//make the reference = null
//		String name="Chris";//Eligible for GC
//		name=null;
//		
//		//local objects are marked as garbage once function execution completes and there is
//		//no reference pointing to that object
//		String name3=demo();
//		//2 ways to invoke the GC explicitly
//		System.gc();  //convinient
//		
////		Runtime r1=Runtime.getRuntime();  //faster
////		r1.gc();
//		
//		Runtime.getRuntime().gc();
//		
//	}
//
//	private static String demo() {
//		String name1="David";
//		String name2="Elcid";
//		
//		return name2;
//	}

	
	public static void main(String[] args) {
		Student s1=new Student(1,"Alice");
		Student s2=new Student(2,"Ben");
		s1=null;
		//Runtime.getRuntime().gc();
		System.gc();
	}
}
