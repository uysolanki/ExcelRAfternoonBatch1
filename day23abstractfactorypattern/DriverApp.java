package day23abstractfactorypattern;

import java.util.Scanner;

public class DriverApp {
		static Court court=null;
		static Accessories accessory=null;
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
		court=FactoryManager.getCourt(courtChoice);
		
		
		System.out.println("***Accessories Options***");
		System.out.println("1.Cricket Kit");
		System.out.println("2.Football Kit");
		System.out.println("3.Tennis Kit");
		System.out.println("4.Skating Kit");
		System.out.println("0.Exit");
		System.out.println("Choose Court");
		int accessoryChoice=sc.nextInt();
		accessory=FactoryManager.getAccessories(accessoryChoice);
		
		System.out.println("Bill");
		System.out.println("Name "+ name);
		System.out.println("Mobile Number"+ mobile);
		System.out.println("Court Type"+ court.getCourtType());
		System.out.println("Court Price"+ court.getCourtPrice());
		System.out.println("Accessory Price"+ accessory.getAccessoriesCost());
		System.out.println("Total Cost"+ (court.getCourtPrice()+accessory.getAccessoriesCost()));
		
	

	}

}
