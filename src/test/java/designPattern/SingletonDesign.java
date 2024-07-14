package designPattern;

 class Singleton{
private static Singleton instance;
	
	private Singleton(){
		//Create private Constructor
	}
	
	//Static factory Method
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
	
}

public class SingletonDesign {
	
	public static void main(String[] args) {
		{
	        Singleton.getInstance().doSomething();
	    }

	}

}
