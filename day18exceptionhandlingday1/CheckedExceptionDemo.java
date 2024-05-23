package day18exceptionhandlingday1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Please enter Numerator");
		int numerator=Integer.parseInt(br.readLine());       
		System.out.println("Please enter Denominator");
		int denominator=Integer.parseInt(br.readLine());  
		
		int result=numerator/denominator;  //ArithmeticException
		}
		catch(IOException | RuntimeException e2 )
		{
			System.out.println(e2.getLocalizedMessage());
		}

		

	}

}
