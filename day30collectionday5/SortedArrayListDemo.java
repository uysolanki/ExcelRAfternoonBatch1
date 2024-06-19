package day30collectionday5;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayListDemo {

	public static void main(String[] args) {
//		ArrayList<String> students=new ArrayList();
//		students.add("Ben");
//		students.add("Alice");
//		students.add("David");
//		students.add("Chris");
//		
//		System.out.println("Before Sorting " +students);
//		Collections.sort(students);
//		System.out.println("After Sorting " +students);
		
		Player p1=new Player(18,"Virat", 100,1000);
		Player p2=new Player(45,"Rohit", 200,2000);
		Player p3=new Player(1,"Rahul", 50,700);
		Player p4=new Player(73,"Surya", 40,500);
		
		ArrayList<Player> team=new ArrayList();
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
		
		System.out.println("Before Sorting " +team);
		Collections.sort(team,new PnoComparator());
		System.out.println("After Sorting " +team);

	}

}
