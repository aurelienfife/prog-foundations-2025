package inclassexercises;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercises {
	
	// Scanner used by all exercises, declared at class-level
	private Scanner sc;
	
	// Constructor function initialises anything that needs to be
	// when creating object
	public Exercises() {
		sc = new Scanner(System.in);
	}
	
	

	public void StrawBags() {
		// Variation on the 'Bag of grit'
		// Exercise
		double UNITPRICE = 6.0;
		double SHIPPING = 3.0;
				
		// Ask user for quantity and read value from kbd
		System.out.print("How many bags do you want?     ");
		int quantity = sc.nextInt();
		
		// Declare total before if/else otherwise it will not exist
		// after if/else (scope)
		double total = quantity * UNITPRICE;
		System.out.println("Total for items: " + total + " GBP");
		
		if(quantity <= 6) {
			// Add shipping cost
			total += SHIPPING;
			System.out.println("Total after shipping cost: " + total + " GBP");
		}
	}

	
	public void studentSearch() {
		
		// Create an empty list, add 10 names
		ArrayList<String> students = new ArrayList<String>();
		
		
	}

}
