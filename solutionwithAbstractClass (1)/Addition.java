package day22solid.scp.solutionwithAbstractClass;

public class Addition extends ArithmeticOperation {

	public Addition(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	@Override
	void calculate() {
		result=this.n1+this.n2;
		System.out.println("Addition result :"+result);
		
	}

}
