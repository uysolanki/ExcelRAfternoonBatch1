package day22solid.dip.solution;

public class DieselEngine  implements Engine{
	String engineMfgName;
	int engineCapacity;
	int engineCC;
	
	public DieselEngine() {}
	public DieselEngine(String engineMfgName, int engineCapacity, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineCapacity = engineCapacity;
		this.engineCC = engineCC;
	}
	@Override
	public void startEngine() {
		System.out.println("Diesel Started");
		
	}
}
