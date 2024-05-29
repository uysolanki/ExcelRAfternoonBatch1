package day22solid.dip.problem;

public class Engine {

	String engineMfgName;
	int engineCapacity;
	int engineCC;

	public Engine(String engineMfgName,int engineCapacity,int engineCC)
	{
	this.engineMfgName=engineMfgName;
	this.engineCapacity=engineCapacity;
	this.engineCC=engineCC;
	}

	public void startEngine()
	{
		System.out.println("Engine Started...");
	}
}
