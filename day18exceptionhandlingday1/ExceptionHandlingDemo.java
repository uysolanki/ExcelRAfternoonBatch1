package day18exceptionhandlingday1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Please enter Numerator");
	int numerator=sc.nextInt();        //apple InputMismatchExecption
	System.out.println("Please enter Denominator");
	int denominator=sc.nextInt();
	
	int result=numerator/denominator;  //ArithmeticException
	System.out.println("The result is "+result);
	

	System.out.println("hiiii");
	}

}
