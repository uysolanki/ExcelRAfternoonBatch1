package day22solid.dip.solutionwithAbstractClass;

public class DriverApp {

	public static void main(String[] args) {
		Engine pengine=new PetrolEngine("Honda",25,2500);
		Engine dengine=new DieselEngine("BMW",35,3500);
		Car car=new Car("Honda", "City",1000, dengine);
		
		car.startCar();

	}

}
