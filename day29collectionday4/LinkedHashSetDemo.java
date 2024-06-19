package day29collectionday4;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet();
		System.out.println(names.add("Alice"));
		System.out.println(names.add("David"));
		names.add("Elcid");
		names.add("Ben");
		names.add("Frank");		
		names.add("Chris");
		System.out.println(names.add(null));
		System.out.println(names.add(null));
		
		System.out.println(names);

	}

}
