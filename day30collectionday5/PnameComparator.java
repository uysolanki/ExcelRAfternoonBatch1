package day30collectionday5;

import java.util.Comparator;

public class PnameComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		return p1.getPname().compareTo(p2.getPname());
	}

}

