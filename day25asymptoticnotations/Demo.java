package day25asymptoticnotations;

public class Demo {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)							//i			//j
		{												//1			1		
			for(int j=1;j<=4;j++)						//1			2
			{											//1			3
				System.out.println("Excelr");			//2			1
			}											//2			2
		}												//2			3
														//3			1
	}													//3			2
														//3			3
}
 // O(Nsquare)