package day31collectionday6;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {						
		Scanner sc=new Scanner(System.in);							
		System.out.println("Enter String");							
		String input=sc.next();										
		System.out.println("Entered String :"+input);				
		
		Stack<Character> stack=new Stack();
		for(char c:input.toCharArray())
		{
			stack.push(c);  //
		}
		
		String revString="";
		while(!stack.isEmpty())
		{
			revString=revString+stack.pop();  //"  "e"  "ec"  "eci"   "ecil" "ecilA"
		}
		
		System.out.println("Reversed String :"+revString);
		
		int n=input.compareTo(revString);
		if(n==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
