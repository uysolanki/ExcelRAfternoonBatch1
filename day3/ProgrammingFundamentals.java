package day3;

import java.util.Scanner;

public class ProgrammingFundamentals 
{
		public static void main(String[] args) {
//			int ownerQuotedPrice=10;
//			double newPaperPrice=ownerQuotedPrice;
//			System.out.println(newPaperPrice);
			
//			
//			double ownerQuotedPrice=10.75;
//			int newPaperPrice=(int)ownerQuotedPrice;
//			System.out.println(newPaperPrice);
//			
//			byte age=23;
//			long longAge=age;
			
//			long longAge=23;
//			byte age=(byte) longAge;
			
//			int a=10,b=20,c;
//			System.out.println(a);
	
//			int n=23;
//			int d=4;
//			int ans=n/d;
//			System.out.println(ans);
			
//			int n=23;
//			int d=4;
//			double ans=n/d;
//			System.out.println(ans);
			
			
//			double n=23;
//			double d=4;
//			int ans=(int) (n/d);
//			System.out.println(ans);
			
//			//primitive					//Non Primitve
//			byte						Byte
//			short						Short
//			int							Integer
//			long						Long
//			
//			float						Float
//			double						Double
			
			 //  -128                 0                 127
			
//			Byte b2=10;
//			System.out.println("Min value for Byte"+b2.MIN_VALUE);
//			System.out.println("Max value for Byte"+b2.MAX_VALUE);
//			
//			short s1;
//			Short s2=20000;
//			
//			System.out.println("Min value for Short"+s2.MIN_VALUE);
//			System.out.println("Max value for Short"+s2.MAX_VALUE);
//			
//			Integer i=100;
//			
//			System.out.println("Min value for int"+i.MIN_VALUE);
//			System.out.println("Max value for int"+i.MAX_VALUE);
//			
//			Long l=100L;
//			System.out.println("Min value for Long"+l.MIN_VALUE);
//			System.out.println("Max value for Long"+l.MAX_VALUE);
			
//			int age;	 //declared		

			Scanner sc=new Scanner(System.in);
//			System.out.println("Please enter your age");  //17
//			age=sc.nextInt(); 
//			
//			if(age>=18)
//			{
//				System.out.println("Adult");
//			}
//			else
//			{
//				System.out.println("Minor");
//			}
//			
			int age=45;
			int waistSize=42;
			double height=6.3;
			// F				F				T
			if(age<=21 && waistSize<=32 && height>=6.1)
					System.out.println("Elligible for Modeling");
			else
				System.out.println("Not Elligible for Modeling");
			
		}

}
