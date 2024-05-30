package day23factorypattern;

import java.util.Scanner;

public class DriverApp {
		static Court court=null;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		Long mobile;
		
		System.out.println("Enter Name");
		name=sc.next();
		
		System.out.println("Enter Mobile");
		mobile=sc.nextLong();
		
		System.out.println("***Court Options***");
		System.out.println("1.Cricket");
		System.out.println("2.Football");
		System.out.println("3.Tennis");
		System.out.println("4.Skating");
		System.out.println("0.Exit");
		System.out.println("Choose Court");
		int courtChoice=sc.nextInt();
		
		if(courtChoice==0)
			System.exit(0);
		else
		court=CourtManager.getCourt(courtChoice);
		
		System.out.println("Bill");
		System.out.println("Name "+ name);
		System.out.println("Mobile Number"+ mobile);
		System.out.println("Court Type"+ court.getCourtType());
		System.out.println("Court Price"+ court.getCourtPrice());
		
		
		

	}

}
