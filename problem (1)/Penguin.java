package day22solid.isp.problem;

public class Penguin implements Bird{

	@Override
	public void fly() {}

	@Override
	public void walk() {
		System.out.println("Penguin Walking");
	}

}
