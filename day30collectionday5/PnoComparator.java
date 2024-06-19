package day30collectionday5;

import java.util.Comparator;

public class PnoComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.getPno()==p2.getPno())
			return 0;
		else if(p1.getPno()>p2.getPno())
			return 1;
		else
			return -1;
	}

}
