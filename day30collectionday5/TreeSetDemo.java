package day30collectionday5;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		Player p1=new Player(18,"Virat", 100,1000);
		Player p2=new Player(45,"Rohit", 200,2000);
		Player p3=new Player(1,"Rahul", 50,700);
		Player p4=new Player(73,"Surya", 40,500);
		
		Set<Player> team=new TreeSet(new PnoComparator());
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
		for(Player p:team)
		System.out.println(p.getPname());

	}

}
