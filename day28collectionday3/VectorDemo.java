package day28collectionday3;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
	//Vector(); // default capacity 10  size()
		
//		Vector v1=new Vector(); //default capacity=10, default autogrow x2
//		System.out.println("Capacity " +v1.capacity());
//		
//		for(int i=1;i<=10;i++)
//		v1.add("Alice");
//		System.out.println(v1);
//		
//		v1.add("Alice");
//		
//		System.out.println("Size " +v1.size());
//		System.out.println("Capacity " +v1.capacity());
		
//		Vector v2=new Vector(4); //user defined capacity=4, default autogrow x2
//		for(int i=1;i<=4;i++)
//			v2.add("Alice");
//			v2.add("Alice");
//		
//		System.out.println("Size " +v2.size());
//		System.out.println("Capacity " +v2.capacity());
		
		Vector v3=new Vector(4,3); //user defined capacity=4, user defined autogrow 3
		for(int i=1;i<=4;i++)
			v3.add("Alice");
			v3.add("Alice");
		
		System.out.println("Size " +v3.size());
		System.out.println("Capacity " +v3.capacity());
		
		
		

	}

}
