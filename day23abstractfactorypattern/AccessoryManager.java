package day23abstractfactorypattern;

public class AccessoryManager {
	static Accessories accessories;

	public static Accessories getAccessories(int accessoryChoice) {
		switch (accessoryChoice) {
		case 1:
			accessories = new CricketAccessory();
			break;
		case 2:
			accessories = new FootballAccessory();
			break;
		case 3:
			accessories = new TennisAccessory();
			break;
		
		}
		return accessories;
	}
}
