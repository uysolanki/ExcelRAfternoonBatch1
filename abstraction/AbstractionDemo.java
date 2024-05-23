package day17.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
//		ConcreteClass c1=new ConcreteClass();
//		c1.function1();
//		c1.function2();
//		c1.function3();

//		Car c2=new Car();
		
		Black car1=new BatmanCar();
		car1.function1();
		car1.function2();
		car1.function3();
		System.out.println("*********************");
		
		Car car2=new BatmanCar();
		car2.function1();
		car2.function2();
		car2.function3();
		System.out.println("*********************");
		
		BatmanCar car3=new BatmanCar();
		car3.function1();
		car3.function2();
		car3.function3();
		car3.function4();	
	}

}
