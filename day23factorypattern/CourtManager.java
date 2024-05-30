package day23factorypattern;

public class CourtManager {

	static Court court;
	public static Court getCourt(int courtChoice)
	{
		switch(courtChoice)
		{
		case 1: court =new CricketCourt(); break;
		case 2: court =new FootballCourt(); break;
		case 3: court =new TennisCourt(); break;
		case 4: court =new SkatingCourt(); break;
		}
		return court;
	}
}
