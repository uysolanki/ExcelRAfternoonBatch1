package day22solid.dip.problem;

public class DriverApp {

	public static void main(String[] args) {
		Engine engine=new Engine("Honda",25,2500);
		
		Car car=new Car("Honda", "City",1000, engine);
		
		car.startCar();

	}

}
