package day29collectionday4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import day27collectionday2.Player;

public class TreeSetDemo {

	public static void main(String[] args) {
//		Integer i1;
//		Set<String> names=new TreeSet();
//		System.out.println(names.add("Alice"));
//		System.out.println(names.add("David"));
//		names.add("Elcid");
//		names.add("Ben");
//		names.add("Frank");		
//		names.add("Chris");
//		names.add("3");
//		names.add("1");
//		
//		System.out.println(names);
		
		Player p1=new Player(18,"Virat", 100,1000);
		Player p2=new Player(45,"Rohit", 200,2000);
		Player p3=new Player(1,"Rahul", 50,700);
		Player p4=new Player(73,"Surya", 40,500);
		
		Set<Player> team=new TreeSet();
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);

	}

}
