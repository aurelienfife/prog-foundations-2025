package functiondemo;

public class MainClass {
	
	public String keywordOfTheWeek = "APPLEPIE";

	// public: visible from outside
	// static: can be called without creating an object
	// void: doesn't return data
	// note: void needs to be at the top of your class
	public static void main(String[] args) {
		
		System.out.println("This is the main function.");
		
		String firstName = "Aurelien";
		String name = "Sarah";
		
		greet(firstName);
		greet(name);
		
		// The other class requires instantiation
		AnotherClass c = new AnotherClass();
		c.mainCode(); 
		
		// Unable to call c.greet(...) because it's private
	}

	// Because this example doesn't involve OOP
	// Every function need to be created as static
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
		
	}
	
}
