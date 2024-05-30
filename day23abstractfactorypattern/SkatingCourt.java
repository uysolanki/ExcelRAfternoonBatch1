package day23abstractfactorypattern;

public class SkatingCourt implements Court {

	@Override
	public double getCourtPrice() {
		return 2000;
	}

	@Override
	public String getCourtType() {
		return "Skating Court";
	}

}
