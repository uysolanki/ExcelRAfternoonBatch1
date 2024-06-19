package day29collectionday4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 
{
public static void main(String[] args) {
	Set<String> names=new HashSet();
	names.add("Alice");
	names.add("Ben");
	names.add("Chris");
	names.add("Ben");
	names.add("Chris");
//	
//	System.out.println("Alice : " +"Alice".hashCode());
//	System.out.println("Ben : " +"Ben".hashCode());
//	System.out.println("Chris: " +"Chris".hashCode());
//	System.out.println(names);

//	for(String s:names)
//	{
//		System.out.println(s);
//	}
	
//	Set<Integer> numbers=new HashSet();
//	numbers.add(new Integer(1));
//	numbers.add(new Integer(2));
//	numbers.add(new Integer(3));
//	
//	System.out.println("1 : " +new Integer(1).hashCode());
//	System.out.println("2 : " +new Integer(2).hashCode());
//	System.out.println("3 : " +new Integer(3).hashCode());
//	System.out.println(numbers);
	
	Set<Integer> a=new HashSet(Arrays.asList(1,2,3));
	Set<Integer> b=new HashSet(Arrays.asList(3,4,5));
	System.out.println("Set A"+a);
	System.out.println("Set B"+b);
	a.addAll(b);
	System.out.println("A Union B"+a);
	
	Set<Integer> a1=new HashSet(Arrays.asList(1,2,3));
	Set<Integer> b1=new HashSet(Arrays.asList(3,4,5));
//	System.out.println("Set A"+a1);
//	System.out.println("Set B"+b1);
	a1.retainAll(b1);
	System.out.println("A Intersection B"+a1);
	
}
}
