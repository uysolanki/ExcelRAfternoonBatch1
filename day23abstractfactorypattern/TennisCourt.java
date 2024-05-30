package day23abstractfactorypattern;

public class TennisCourt implements Court {

	@Override
	public double getCourtPrice() {
		return 1000;
	}

	@Override
	public String getCourtType() {
		return "Tennis Court";
	}

}
