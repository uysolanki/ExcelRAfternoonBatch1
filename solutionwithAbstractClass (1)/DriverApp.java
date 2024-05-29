package day22solid.scp.solutionwithAbstractClass;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		double n1,n2,result;
		ArithmeticOperation arithmatic;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number 1");
		n1=sc.nextDouble();
		System.out.println("Please enter number 2");
		n2=sc.nextDouble();
		
		System.out.println("***Menu***");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("4.Exit");
		System.out.println("Choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 : arithmatic=new Addition(n1,n2);
				 arithmatic.calculate();
				 break;
		case 2 : arithmatic=new Substraction(n1,n2);
		 		 arithmatic.calculate();
		 		 break;
		case 4 : System.exit(0);
		default : System.out.println("Invalid Credentials");
		}

	}

}
