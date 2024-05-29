package day22solid.scp.solutionwithAbstractClass;

public class Substraction extends ArithmeticOperation {

	public Substraction(double n1,double n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	@Override
	void calculate() {
		result=this.n1-this.n2;
		System.out.println("Substraction :"+result);
		
	}

}
