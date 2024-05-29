package day22solid.isp.solution;

public class Eagle implements FlyingBird,WalkingBird{

	@Override
	public void walk() {
		System.out.println("Eagle Walking");
		
	}

	@Override
	public void fly() {
		System.out.println("Eagle Flying");
		
	}

}
