package day24singeltonpattern;

public class DriverApp {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.getName());
		System.out.println(s1.hashCode());
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.getName());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
	}

}
