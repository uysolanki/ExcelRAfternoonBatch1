package day22solid.dip.solutionwithAbstractClass;

public class DieselEngine extends Engine{

	
	public DieselEngine() {}
	public DieselEngine(String engineMfgName, int engineCapacity, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineCapacity = engineCapacity;
		this.engineCC = engineCC;
	}
	@Override
	public void startEngine() {
		System.out.println("DieselEngine Started");
		
	}

}
