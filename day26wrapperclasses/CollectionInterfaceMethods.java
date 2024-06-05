package day26wrapperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		List<String> mh=new ArrayList();  //Capacity = 10,  Size=0
		System.out.println(mh.size());
		mh.add("Pune");	   //Capacity = 10,  Size=1
		mh.add("Mumbai");  //Capacity = 10,  Size=2
		mh.add("Nagpur");  //Capacity = 10,  Size=3
		
		List<String> newmh=new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur","Nashik","Satara"));
		System.out.println(newmh);
		
		List<String> rj=new ArrayList();
		rj.add("Jaipur");
		rj.add("Bikaner");
		rj.add("Jodhpur");
		
		System.out.println(rj);
		
		List<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		
		

	}

}
