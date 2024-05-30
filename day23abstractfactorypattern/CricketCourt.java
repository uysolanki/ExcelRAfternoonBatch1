package day23abstractfactorypattern;

public class CricketCourt implements Court {

	@Override
	public double getCourtPrice() {
		return 500;
	}

	@Override
	public String getCourtType() {
		// TODO Auto-generated method stub
		return "Cricket Court";
	}

}
