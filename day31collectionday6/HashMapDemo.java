package day31collectionday6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> employees=new LinkedHashMap();

		employees.put("Alice",800);
		employees.put("Ben",900);
		employees.put("Chris",1000);


//		System.out.println(employees);
//		System.out.println(employees.get("Ben"));
		
//		Set<String> keys=employees.keySet();
//		System.out.println(keys);
//		int max=0;
//		for(String s:keys)
//		{
//			if(employees.get(s)>max)
//			{
//				max=employees.get(s);
//			}
//		}
//		
//		System.out.println(max);

		
//		int numbers[]= {1,2,3,4,5};
//		int oddc=0;
//		int evenc=0;
//		for(int n:numbers)
//		{
//			if(n%2==0)
//				evenc++;
//			else 
//				oddc++;
//		}
//		System.out.println("Number of Odd Elements "+oddc);
//		System.out.println("Number of Even Elements "+evenc);
		
		int numbers[]= {1,2,3,4,5};
		Map<String,Integer> counters=new HashMap();
		counters.put("oddc", 0);
		counters.put("evenc", 0);
		for(int n:numbers)
			{
				if(n%2==0)
					counters.put("evenc", counters.get("evenc")+1);
				else 
					counters.put("oddc", counters.get("oddc")+1);
			}
		System.out.println("Number of Odd Elements "+counters.get("oddc"));
		System.out.println("Number of Even Elements "+counters.get("evenc"));
	}

}
