package day25asymptoticnotations;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		int i,counter=0;
		int primitiveOperation=0;
		for(i=1;i<=n;i++)
		{
			primitiveOperation++;
			if(n%i==0)
			{
				counter++;
			}
		}
		if(counter==2)
		{
			System.out.println("Number is Prime and Primitive Operation performed "+primitiveOperation+ "times");
		}
		else
		{
			System.out.println("Number is Not Prime and Primitive Operation performed "+primitiveOperation+ "times");
		}

	}

}


//T(n)=O(n)
