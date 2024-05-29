package day22solid.dip.solution;

public class ElectiralEngine implements Engine{
	String engineMfgName;
	int engineCapacity;
	int engineCC;
	
	public ElectiralEngine() {}
	public ElectiralEngine(String engineMfgName, int engineCapacity, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineCapacity = engineCapacity;
		this.engineCC = engineCC;
	}
	@Override
	public void startEngine() {
		System.out.println("ElectiralEngine Started");
		
	}
}
