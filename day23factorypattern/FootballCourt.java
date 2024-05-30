package day23factorypattern;

public class FootballCourt implements Court {

	@Override
	public double getCourtPrice() {
		return 700;
	}

	@Override
	public String getCourtType() {
		return "Football Court";
	}

}
