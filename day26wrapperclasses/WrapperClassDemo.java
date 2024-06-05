package day26wrapperclasses;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a=10;  //Option A
		System.out.println("Primitive A " + a);
		
		Integer aobj=new Integer(a);  //Option B
		System.out.println("Non Primitive A Object " + a);
		
		int b=aobj.intValue();
		
		String a1="Apple";  //Alphebetic String
		String a2="Apple15"; //Alpha Numeric String
		String a3="15";     //Numeric String
		String a4="16";     //Numeric String
		System.out.println(Integer.parseInt(a3)+Integer.parseInt(a4));
		
		int c=18;
		int d=45;
		System.out.println(String.valueOf(c)+String.valueOf(d));
		
	}

}
