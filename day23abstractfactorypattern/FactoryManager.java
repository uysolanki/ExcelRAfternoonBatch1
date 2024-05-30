package day23abstractfactorypattern;

public class FactoryManager {
	
	static AccessoryManager accessoriesManager=null;
	static CourtManager courtManager=null;
	static Court getCourt(int courtChoice)
	{
		return courtManager.getCourt(courtChoice);
	}
	
	static Accessories getAccessories(int accessoryChoice)
	{
		return accessoriesManager.getAccessories(accessoryChoice);
	}
	

}
