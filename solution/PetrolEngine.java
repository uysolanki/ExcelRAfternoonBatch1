package day22solid.dip.solution;

public class PetrolEngine implements Engine {
	String engineMfgName;
	int engineCapacity;
	int engineCC;
	
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
