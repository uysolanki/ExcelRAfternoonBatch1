package day28collectionday3;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
//		LinkedList<String> contactlist=new LinkedList();
//		contactlist.add("Alice");
//		contactlist.add("Ben");
//		contactlist.add("Chris");
//		System.out.println(contactlist);
//		contactlist.addLast("David");
//		contactlist.addFirst("Aamir");
//		contactlist.add(3, "Bharat");
//		System.out.println(contactlist);  //[Aamir, Alice, Ben, Bharat, Chris, David]
//		System.out.println(contactlist.peek()); //Aamir
//		System.out.println(contactlist);  //[Aamir, Alice, Ben, Bharat, Chris, David]
//		System.out.println(contactlist.poll());//Aamir
//		System.out.println(contactlist);  //[Alice, Ben, Bharat, Chris, David]
		
		 LinkedList<Integer> l = new LinkedList<>();
         l.add(2);   // [2,5,6,7]
         l.addFirst(3);
         l.add(4);
         l.addLast(5);
         l.remove(2);
         l.offer(6);
         l.poll();
         l.add(7);
     System.out.println(l.toString());
     System.out.println(l.peek());
     System.out.println(l.peekFirst());
		
	}

}
