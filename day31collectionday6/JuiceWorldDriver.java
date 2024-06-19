package day31collectionday6;

import java.util.Scanner;

public class JuiceWorldDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Qunatity of Apple Juice");
		int appleJuice=sc.nextInt();
		System.out.println("Please enter Qunatity of Orange Juice");
		int orangeJuice=sc.nextInt();
		System.out.println("Please enter Qunatity of Mango Juice");
		int mangoJuice=sc.nextInt();
		
		MinimumTime mt=new MinimumTime(appleJuice,orangeJuice,mangoJuice);
		int totalSeconds=mt.calculateMinimumTime();
		System.out.println("Minimum Time Taken : "+totalSeconds + " seconds");

	}
}
