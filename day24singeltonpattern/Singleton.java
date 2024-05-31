package day24singeltonpattern;

public class Singleton {
	
	private static Singleton singleton=null;
	
	private String name;
	
	private Singleton()
	{
		name="Alice";
	}

	
	public String getName() {
		return name;
	}


	public static Singleton getInstance()
	{
		if(singleton==null)					//1st Object
		{
			singleton=new Singleton();
			return singleton;
		}
		
		return singleton;
	}
}
