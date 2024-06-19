package day31collectionday6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AhtleticsHashMapDemo {

	public static void main(String[] args) {
		//"first" , {18,Virat,21,"Red"}
		//"second" , {45,Rohit,20,"Green"}
		
		Map<String,Player>  m100=new HashMap();
		m100.put("first", new Player(18,"Virat",21,"Red"));
		m100.put("second", new Player(45,"Rohit",20,"Green"));
		m100.put("third", new Player(1,"Rahul",21,"Blue"));
		
		//System.out.println(m100);
		
		//display the name of the Player who has come first in 100m race
		//System.out.println(m100.get("first").getPname());
		
		
		Map<String,Player>  m200=new HashMap();
		m200.put("first", new Player(77,"Shubman",21,"Red"));
		m200.put("second", new Player(63,"Hardik",20,"Green"));
		m200.put("third", new Player(73,"Surya",21,"Blue"));
		//display the name of the Player who has come first in 200m race
		//System.out.println(m200.get("first").getPname());
		
		List<Map<String,Player>> olympic =new ArrayList();
		olympic.add(m100);
		olympic.add(m200);
		
		//using olympic display the name of the Player who has come first in 100m race
		System.out.println(olympic.get(0).get("first").getPname());
		System.out.println(olympic.get(1).get("second").getHouse());
		
		System.out.println(olympic);
		
	}

}
