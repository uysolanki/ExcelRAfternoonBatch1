package day22solid.dip.solution;

public class DriverApp {

	public static void main(String[] args) {
		Engine pengine=new PetrolEngine("Honda",25,2500);
		Engine dengine=new DieselEngine("BMW",35,3500);
		Engine evengine=new ElectiralEngine("Tesla",55,5500);
		Car car=new Car("Honda", "City",1000, evengine);
		
		car.startCar();

	}

}
