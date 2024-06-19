package day30collectionday5;

import java.util.Comparator;


public class RunsComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if(p1.getRuns()==p2.getRuns())
			return 0;
		else if(p1.getRuns()>p2.getRuns())
			return 1;
		else
			return -1;
	}

}