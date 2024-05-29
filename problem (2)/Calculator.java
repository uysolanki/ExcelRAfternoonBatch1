package day22solid.scp.problem;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	double n1,n2,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter number 1");
	n1=sc.nextDouble();
	System.out.println("Please enter number 2");
	n2=sc.nextDouble();
	
	System.out.println("***Menu***");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Exit");
	System.out.println("Choice : ");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1 : result=n1+n2;
			 System.out.println("Addition Result is"+result);
			 break;
	case 2 : result=n1-n2;
			 System.out.println("Substraction Result is"+result);
			 break;
	case 3 : result=n1*n2;
	 		 System.out.println("Multiplication Result is"+result);
	 		 break;
	case 4 : System.exit(0);
	default : System.out.println("Invalid Credentials");
	}
}
}
