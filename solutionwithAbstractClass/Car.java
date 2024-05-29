package day22solid.dip.solutionwithAbstractClass;

public class Car {
	String carMfgName;
	String carModel;
	double carPrice;
	Engine engine;
	
	public Car(String carMfgName, String carModel, double carPrice, Engine engine) {
		this.carMfgName = carMfgName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.engine = engine;
	}
	
	public void startCar()
	{
		this.engine.startEngine();
	}
	
}
