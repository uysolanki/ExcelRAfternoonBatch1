package day30collectionday5;

import java.util.Comparator;


public class InningsComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.getInnings()==p2.getInnings())
			return 0;
		else if(p1.getInnings()>p2.getInnings())
			return 1;
		else
			return -1;
	}

}