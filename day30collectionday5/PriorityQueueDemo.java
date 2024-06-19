package day30collectionday5;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	
	PriorityQueue<Integer> jerseys=new PriorityQueue(Collections.reverseOrder());
	jerseys.add(18);
	jerseys.add(45);
	jerseys.add(19);
	jerseys.add(73);
	jerseys.add(99);
	jerseys.add(12);
	jerseys.add(6);
	jerseys.add(6);
	
	Iterator<Integer> jitr=jerseys.iterator();
	while(jitr.hasNext())
	{
		System.out.println(jitr.next());
	}
	
}
}
