package day22solid.dip.solutionwithAbstractClass;

public class PetrolEngine extends Engine{

	
	public PetrolEngine() {}
	public PetrolEngine(String engineMfgName, int engineCapacity, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineCapacity = engineCapacity;
		this.engineCC = engineCC;
	}
	@Override
	public void startEngine() {
		System.out.println("Petrol Engine Started");
		
	}

}
