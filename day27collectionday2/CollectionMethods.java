package day27collectionday2;

import java.util.ArrayList;
import java.util.List;

import day26wrapperclasses.Student;

public class CollectionMethods {
//	India.get(0);
//	
//	List<Student> students=new ArrayList();
//	students.add(new Student(101,"Alice",98.5));
//	students.add(new Student(103,"Ben",78.5));
//	students.add(new Student(102,"Chris",68.5));
//	
//	Student student=students.get(2);
	public static void main(String[] args) {
		
	
	List<String> mh=new ArrayList();  
//	System.out.println(mh.size());
	mh.add("Pune");	   
	mh.add("Mumbai");  
	mh.add("Nagpur");  
	String x=mh.get(0);
	//System.out.println(mh);
	
	List<String> rj=new ArrayList();
	rj.add("Jaipur");
	rj.add("Bikaner");
	rj.add("Jodhpur");
	rj.add(null);
	rj.add(null);
	rj.add(null);
	
	//System.out.println(rj);
	
//	List<String> India=new ArrayList();
//	India.addAll(mh);
//	India.addAll(rj);//[Pune,Mumbai,Nagpur,Jaipur,Bikaner,Jodhpur]
	
	List<List<String>> India=new ArrayList();
	India.add(mh);
	India.add(rj); //[[Pune,Mumbai,Nagpur],[Jaipur,Bikaner,Jodhpur]]
	System.out.println(India);
	
//	List<String> k=India.get(1);
//	String m=k.get(2);
//	System.out.println(m);
	
	System.out.println(India.get(1).get(2));
	
	}
}
