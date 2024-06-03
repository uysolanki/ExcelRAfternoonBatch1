package day25asymptoticnotations;

public class Prime2 {

	public static void main(String[] args) {
		int n = 17;
		int i, flag = 0;
		int primitiveOperation = 0;
		for (i = 2; i < n/2; i++) {
			primitiveOperation++;
			if (n % i == 0) {
				System.out.println(
						"Number is Not Prime and Primitive Operation performed " + primitiveOperation + "times");

				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is Prime and Primitive Operation performed " + primitiveOperation + "times");

	}

}
//T(n)= O(n/2 -1)
//T(n)= O(n/2 -2)