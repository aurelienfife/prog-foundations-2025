package functiondemo;

public class AnotherClass {

	// This class will have objects created
	// So no need to declare as static
	
	public void mainCode() {
		System.out.println("This is the main function of the other class.");
		
		String firstName = "Aurelien";
		greet(firstName);
		
		// Add two integers
		int result = add(5,6);
		System.out.println(result);
		
		// This will call the overload of "add" with doubles
		double otherResult = add(5.5, 5.5);
		System.out.println(otherResult);
	}
	
	// In this case, greet is private, no need to call from another
	private void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	// Function to add two numbers
	private int add(int a, int b) {
		return a + b;
	}
	// Overload of add to handle doubles
	private double add(double a, double b) {
		return a + b;
	}
	
}
